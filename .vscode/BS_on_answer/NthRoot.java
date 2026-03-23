public class NthRoot {

    public int solution(int n, int m) {
        // for(int i = 1;i<=m;i++){
        // long power = (long)Math.pow(i,n);
        // if(power == m) return i;
        // if(power > m) break;
        // }
        // return -1;
        int low = 1, high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            long ans = 1;
            for (int i = 0; i < n; i++) {
                ans = ans * mid;
                if (ans > m)
                    break;
            }
            if (ans == m)
                return mid;
            if (ans < m)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        NthRoot sol = new NthRoot();
        int n = 3, m = 27;

        // Find nth root
        System.out.println("Nth Root: " + sol.solution(n, m));
    }
}
