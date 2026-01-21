import java.util.ArrayList;
import java.util.List;

public class Leaders {

    public static ArrayList<Integer> display(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;

        // for (int i = 0; i < n; i++) {
        //     boolean leader = true;

        //     for (int j = i + 1; j < n; j++) {
        //         if (nums[j] > nums[i]) {
        //             leader = false;
        //             break;
        //         }
        //     }

        //     if (leader) {
        //         ans.add(nums[i]);
        //     }
        // }
        int max = nums[n-1];
        ans.add(nums[n-1]);
        for(int i = n-2;i >= 0 ;i--){
            if(nums[i] > max){
                ans.add(nums[i]);
                max = nums[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 3, 1, 2 };

        ArrayList<Integer> ans = display(nums);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
