
public class MinRotatedSortedArray {

    public int findMin(int[] nums){
        int low = 0,high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] > nums[high]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        MinRotatedSortedArray sol = new MinRotatedSortedArray();
        int result = sol.findMin(nums);

        System.out.println("Minimum element is " + result);
    }
}
