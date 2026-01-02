import java.util.*;

public class RotateArray {

    public void rotateArrayByOne(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        RotateArray solution = new RotateArray();
        int[] arr = { 1, 2, 3, 4, 5 };

        solution.rotateArrayByOne(arr);

        // Output the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
