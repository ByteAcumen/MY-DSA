import java.util.*;

public class NumberHashingArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 3};

        
        int[] hash = new int[13]; 
        for (int num : arr) {
            hash[num]++;
        }
        
        int[] queries = {1, 4, 2, 3, 12};
        for (int q : queries) {
            System.out.println(q + " → " + hash[q]);
        }
    }
}
