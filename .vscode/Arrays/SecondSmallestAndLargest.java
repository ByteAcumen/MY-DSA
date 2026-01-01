import java.util.*;

class SecondSmallestAndLargest {

    // Function to find the second smallest element in the array
    public static int secondSmallest(int[] arr, int n) {
        int Smallest = Integer.MAX_VALUE;
        int S_Smallest = Integer.MAX_VALUE;
        for(int i = 0; i < n ;i++){
            if(arr[i] < Smallest){
                S_Smallest = Smallest;
                Smallest = arr[i];
            }
            else if (arr[i] < S_Smallest && arr[i] != Smallest){
                S_Smallest = arr[i];
            }
        }
        return S_Smallest;
    }

    // Function to find the second largest element in the array
    public static int secondLargest(int[] arr, int n) {
        int Largest = Integer.MIN_VALUE;
        int S_Largest = Integer.MIN_VALUE;
        for(int i = 0; i < n ;i++){
            if(arr[i] > Largest){
                S_Largest = Largest;
                Largest = arr[i];
            }
            else if (arr[i] > S_Largest && arr[i] != Largest){
                S_Largest = arr[i];
            }
        }
        return S_Largest;
    }

    public static void main(String[] args) {
        // Array of elements
        int[] arr = {1, 2, 4, 7, 7, 5};

        // Calculate the size of the array
        int n = arr.length;

        // Find the second smallest and second largest elements
        int sS = secondSmallest(arr, n);
        int sL = secondLargest(arr, n);

        // Output the results
        System.out.println("Second smallest is " + sS);
        System.out.println("Second largest is " + sL);
    }
}
