import java.util.*;

public class MovingZeroAtEnd {

    public void display(int[] arr) {
        int n = arr.length;
        // int[] temp = new int[n];
        // int index = 0;
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] != 0) {
        //         temp[index] = arr[i];
        //         index++;
        //     }
        // }
        // for (int i = 0; i < temp.length; i++) {
        //     arr[i] = temp[i];
        // }
        int j = -1;
        for(int i = 0; i < n;i++){
            if(arr[i] == 0){
                j=i;
                break;
            }
        }
        if( j == -1) return ;
        for(int i = j+1; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        } 
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        MovingZeroAtEnd obj = new MovingZeroAtEnd();
        obj.display(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
