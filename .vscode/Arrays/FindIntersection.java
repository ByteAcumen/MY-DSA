import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

    public List<Integer> intersection(int[] arr1, int[] arr2, int n, int m) {
        List<Integer> ans = new ArrayList<>();
        // for(int i = 0 ; i < n ; i++){
        // if(i > 0 && arr1[i] == arr1[i-1]) continue;
        // for(int j = 0 ; j < m ; j++){
        // if(arr1[i] == arr2[j]){
        // ans.add(arr1[i]);
        // break;
        // }
        // }
        // }
        // return ans;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;
                j++;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int n = 10;
        int m = 7;
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = { 2, 3, 4, 4, 5, 11, 12 };
        FindIntersection obj = new FindIntersection();
        List<Integer> ans = obj.intersection(arr1, arr2, n, m);
        for (int val : ans)
            System.out.print(val + " ");
    }
}
