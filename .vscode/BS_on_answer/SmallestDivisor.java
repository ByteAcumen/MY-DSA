import java.util.*;

public class SmallestDivisor {

    static class Solution {
        public int smallestDivisor(int[] nums, int threshold) {

            // Brute Force Approach
            // int n = nums.length;
            // int max = Arrays.stream(nums).max().getAsInt();
            // for(int i = 1; i <= max; i++) {
            //     int sum = 0;
            //     for(int num : nums) {
            //         sum += (num + i - 1) / i;
            //     }
            //     if(sum <= threshold) {
            //         return i;
            //     }
            // }
            // return -1;

            // Optimized Approach (Binary Search)
            int low = 1;
            int high = Arrays.stream(nums).max().getAsInt();

            while (low <= high) {
                int mid = low + (high - low) / 2;

                int sum = 0;
                for (int num : nums) {
                    sum += (num + mid - 1) / mid;
                }

                if (sum <= threshold) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            return low;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 5, 9};
        int threshold = 6;

        Solution sol = new Solution();

        int result = sol.smallestDivisor(nums, threshold);

        System.out.println("Answer: " + result);
    }
}