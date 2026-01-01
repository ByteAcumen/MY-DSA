import java.util.*;

class Largest {

    public static int sortArr(int[] arr) {
        int n = arr.length;
        int l = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i]>l){
                l = arr[i];
            }
        }
        return l;
    }

    public static void main(String args[]) {
        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {8, 10, 5, 7, 9};
        
        // Find and output the largest element in both arrays
        System.out.println("The Largest element in the array is: " + Largest.sortArr(arr1));
        System.out.println("The Largest element in the array is: " + Largest.sortArr(arr2));
    }
}
