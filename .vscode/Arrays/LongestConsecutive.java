import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    public static int display(int[] nums) {
        int n = nums.length;
        // int longest = 1;
        // for(int i = 0; i < n ; i++){
        // int x = nums[i];
        // int cnt = 1;
        // while(linearSearch(nums,x+1)){
        // x++;
        // cnt++;
        // }
        // longest = Math.max(longest,cnt);
        // }
        // Arrays.sort(nums);
        // int smallest = Integer.MIN_VALUE;
        // int longest = 1;
        // int cnt = 0;
        // for (int i = 0; i < n; i++) {
        // if (nums[i] - 1 == smallest) {
        // cnt += 1;
        // smallest = nums[i];
        // } else if (nums[i] != smallest) {
        // cnt = 1;
        // smallest = 1;
        // }
        // longest = Math.max(cnt, longest);
        // }

        int longest = 1;
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }
        int cnt = 1;
        int x = 0;
        for (int it : st) {
            if (!st.contains(it - 1)) {
                cnt = 1;
                x = it;
            }
            while (st.contains(x + 1)) {
                cnt = cnt + 1;
                x = x + 1;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static boolean linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };

        int ans = display(nums);

        System.out.println(ans);
    }
}