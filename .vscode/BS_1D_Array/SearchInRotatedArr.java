
public class SearchInRotatedArr {

    public int search(int[] arr, int k) {
        int low = 0, high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == k ){
                return mid;
            }

            if(arr[low] <= arr[mid]){
                if(arr[low] <= k && k < arr[mid]){
                    high = mid-1;
                }else{
                    low = mid-1;
                }
            }else{
                if(arr[mid] < k && k <= arr[high]){
                    low = mid+1;
                } else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        SearchInRotatedArr obj = new SearchInRotatedArr();
        int result = obj.search(nums, target);

        System.out.println(result);
    }
}
