public class LongestSubarray {

    // public int longestSubarray(int[] nums, int k) {
    // int n = nums.length;
    // int maxLength = 0;
    // for(int i = 0 ; i < n ; i++){
    // int sum = 0;
    // for(int j = i; j < n; j++){
    // sum += nums[j];
    // if(sum == k){
    // maxLength = Math.max(maxLength,j-i+1);
    // }
    // }
    // }
    // return maxLength;
    // }

    public int longestSubarr(int[] nums, int k) {
        int left = 0, sum = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > k) {
                sum -= nums[left++];
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        // Create an instance of the Solution class
        LongestSubarray solution = new LongestSubarray();

        // Function call to get the result
        int len = solution.longestSubarr(a, k);

        System.out.println("The length of the longest subarray is: " + len);
    }
}
