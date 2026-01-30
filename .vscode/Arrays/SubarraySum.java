import java.util.HashMap;

public class SubarraySum {

    public int subarraySum(int[] arr, int k) {
        // int n = arr.length;
        // int count = 0;
        // for(int i = 0; i < n; i++){
        // int sum = 0;
        // for(int j = i;j < n;j++){
        // sum += arr[j];
        // if(sum == k){
        // count++;
        // }
        // }
        // }
        // return count;

        int n = arr.length;
        int prefixsum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            prefixsum += arr[i];
            int remove = prefixsum - k;
            if (map.containsKey(remove)) {
                count += map.get(remove);
            }
            map.put(prefixsum, map.getOrDefault(prefixsum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = { 3, 1, 2, 4 };

        // Target sum
        int k = 6;

        // Create Solution object
        SubarraySum sol = new SubarraySum();

        // Call function and store result
        int result = sol.subarraySum(arr, k);

        // Print the count of subarrays
        System.out.println("The number of subarrays is: " + result);
    }
}
