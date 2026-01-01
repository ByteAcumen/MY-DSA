class Solution {

    // Function to check if the array is sorted
    public boolean isSorted(int[] arr, int n) {
        for(int i = 1; i < n ; i++){
            if(arr[i] < arr[i-1]) return false;
        }
        return true; 
    }
}

public class SortedOrNot {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4, 5};
        int n = arr.length;

        Solution obj = new Solution();

        boolean ans = obj.isSorted(arr, n);

        // Output result
        if (ans)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
