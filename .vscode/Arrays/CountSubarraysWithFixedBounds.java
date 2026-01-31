import java.util.*;

public class CountSubarraysWithFixedBounds {

    // Function to count valid subarrays
    public static long countSubarrays(int[] nums, int minK, int maxK) {

        long count = 0;

        int lastMin = -1;      // last index where nums[i] == minK
        int lastMax = -1;      // last index where nums[i] == maxK
        int lastInvalid = -1;  // last index where nums[i] < minK or > maxK

        for (int i = 0; i < nums.length; i++) {

            // If element is out of allowed range
            if (nums[i] < minK || nums[i] > maxK) {
                lastInvalid = i;
            }

            // Update last seen positions
            if (nums[i] == minK) {
                lastMin = i;
            }

            if (nums[i] == maxK) {
                lastMax = i;
            }

            // Count valid subarrays ending at index i
            long validSubarrays =
                    Math.min(lastMin, lastMax) - lastInvalid;

            if (validSubarrays > 0) {
                count += validSubarrays;
            }
        }

        return count;
    }

    // Main method for testing
    public static void main(String[] args) {

        // Example test case
        int[] nums = {1, 3, 5, 2, 7, 5};
        int minK = 1;
        int maxK = 5;

        long result = countSubarrays(nums, minK, maxK);

        System.out.println("Number of valid subarrays: " + result);
    }
}
