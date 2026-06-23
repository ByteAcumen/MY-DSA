import subprocess
import sys
from datetime import datetime, timedelta
import os


def run(cmd, cwd=None, env=None):
    return subprocess.run(cmd, cwd=cwd, env=env, shell=False, check=False, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)


def git_in_repo(path):
    r = run(["git", "rev-parse", "--is-inside-work-tree"], cwd=path)
    return r.returncode == 0


def get_git_config(key, path):
    r = run(["git", "config", "--get", key], cwd=path)
    if r.returncode == 0:
        return r.stdout.strip()
    return None


def make_commit_for_date(path, date_str, name, email):
    env = os.environ.copy()
    iso = date_str + "T12:00:00"
    env["GIT_AUTHOR_DATE"] = iso
    env["GIT_COMMITTER_DATE"] = iso
    env["GIT_AUTHOR_NAME"] = name
    env["GIT_AUTHOR_EMAIL"] = email
    env["GIT_COMMITTER_NAME"] = name
    env["GIT_COMMITTER_EMAIL"] = email
    # create an empty commit with the specified date
    r = run(["git", "commit", "--allow-empty", "-m", f"chore: contribution filler {date_str}"], cwd=path, env=env)
    return r


def main():
    if len(sys.argv) < 4:
        print("Usage: python scripts/create_commits.py <repo-path> <start-date> <end-date>")
        print("Dates in YYYY-MM-DD format. Example: 2026-04-01 2026-05-31")
        sys.exit(1)

    repo = sys.argv[1]
    start = sys.argv[2]
    end = sys.argv[3]

    try:
        sd = datetime.fromisoformat(start)
        ed = datetime.fromisoformat(end)
    except Exception as e:
        print("Invalid date format:", e)
        sys.exit(1)

    if not git_in_repo(repo):
        print("Not a git repository:", repo)
        sys.exit(1)

    name = get_git_config("user.name", repo) or "Contribution Filler"
    email = get_git_config("user.email", repo) or "noreply@example.com"

    cur = sd
    created = 0
    while cur <= ed:
        date_str = cur.date().isoformat()
        r = make_commit_for_date(repo, date_str, name, email)
        if r.returncode == 0:
            created += 1
            print(f"Created commit for {date_str}")
        else:
            # show error but continue
            print(f"Skipped {date_str}: git returned {r.returncode}")
            if r.stdout:
                print(r.stdout)
            if r.stderr:
                print(r.stderr)
        cur += timedelta(days=1)

    print(f"Done. Created {created} commits from {start} to {end} (inclusive).")


if __name__ == "__main__":
    main()
