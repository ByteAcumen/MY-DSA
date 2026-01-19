import java.util.*;

public class RearrangeBySign {
    public static int[] rearrangeBySign(int[] A, int n) {
        // List<Integer> pos = new ArrayList<>();
        // List<Integer> neg = new ArrayList<>();
        // for(int i = 0; i < n; i++) {
        //     if (A[i] > 0) pos.add(A[i]);
        //     else neg.add(A[i]);
        // }
        // for(int i = 0; i < n / 2; i++) {
        //     A[2 * i] = pos.get(i);
        //     A[2 * i + 1] = neg.get(i);
        // }
        // return A;
        int posIndex = 0 , negIndex =1;
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(A[i] > 0){
                ans[posIndex] = A[i];
                posIndex += 2;
            }
            else{
                ans[negIndex] = A[i];
                negIndex += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, -4, -5};
        int n = A.length;

        int[] result = rearrangeBySign(A, n);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
