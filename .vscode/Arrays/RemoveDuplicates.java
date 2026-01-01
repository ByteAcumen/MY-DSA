class Solution {

    public int removeDuplicates(int[] arr, int n) {
        int i = 0;
        for(int j = i+1 ; j < n ;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1; 
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int n = arr.length;

        Solution obj = new Solution();

        int newLength = obj.removeDuplicates(arr, n);

        System.out.println("New length after removing duplicates: " + newLength);
        
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
