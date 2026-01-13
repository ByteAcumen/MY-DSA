import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {


    public static int[] twoSumExists(int[] arr,int target){
        int n = arr.length;
        // for(int i = 0; i < n; i++){
        //     for(int j = i+1; j < n;j++){
        //         if(arr[i]+arr[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            int c = target - arr[i];
            if(map.containsKey(c)){
                return new int[]{map.get(c),i};
            }map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }

    public static String twoSumExistsString(int[] arr,int target){
        int n = arr.length;
        // for(int i = 0; i < n; i++){
        //     for(int j = i+1; j < n;j++){
        //         if(arr[i]+arr[j] == target){
        //             return "Yes";
        //         }
        //     }
        // }
        // return "No";
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            int c = target - arr[i];
            if(map.containsKey(c)){
                return "Yes";
            }map.put(arr[i],i);
        }
        return "No";
    }


    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = TwoSum.twoSumExists(nums, target);
        System.out.println(Arrays.toString(result));
        System.out.println("Indices: " + result[0] + ", " + result[1]);
        System.out.println(TwoSum.twoSumExistsString(nums, target));

    }
}
