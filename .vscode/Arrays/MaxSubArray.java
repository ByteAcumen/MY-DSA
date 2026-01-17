public class MaxSubArray {

    public int subarray(int[] arr){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        // for(int i = 0; i < n; i++){
        //     int sum = 0;
        //     for(int j = i; j < n; j++){
        //         sum += arr[j];
        //         maxi = Math.max(sum, maxi);
        //     }
        // }
        // return maxi;

        int sum = 0;
        for(int i = 0; i < n ; i++){
            sum += arr[i];
            if(sum > maxi){
                maxi = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        MaxSubArray sol = new MaxSubArray();
        int maxSum = sol.subarray(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
