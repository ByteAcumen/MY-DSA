import java.util.*;

public class RotateByNplace {
    
    public void rotateArrayByN(int[] arr, int d){
        int n = arr.length;
        d = d % n;
        // int[] temp = new int[d];
        // for(int i = 0;i < d;i++){
        //     temp[i] = arr[i];
        // }
        // for(int i = d ; i < n; i++ ){
        //     arr[i-d] = arr[i]; 
        // }
        // for(int i = n-d ; i < n ; i++){
        //     arr[i] = temp[i-(n-d)];
        // }
        helper(arr, 0, n-1);
        helper(arr, 0, d-1);
        helper(arr, d, n-1);


    }

    public void helper(int[] arr , int start , int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        RotateByNplace solution = new RotateByNplace();
        int[] arr = { 1, 2, 3, 4, 5 };
        int d = 10;

        solution.rotateArrayByN(arr,d);

        // Output the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
