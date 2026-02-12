import java.util.*;

class LowerBoundFinder {
    // Function to find the lower bound index using binary search
    public int lowerBound(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 15, 19 }; // Sorted array
        int x = 9; // Target value

        LowerBoundFinder finder = new LowerBoundFinder(); // Create object
        int ind = finder.lowerBound(arr, x); // Find lower bound

        System.out.println("The lower bound is the index: " + ind); // Print result
    }
}
