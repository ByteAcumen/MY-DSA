public class SortZeroOneTwo {

    public static void sort(int[] arr){
        // int cnt0 = 0, cnt1 =0,cnt2=0;
        // for(int num : arr){
        //     if(num == 0)cnt0++;
        //     else if(num == 1)cnt1++;
        //     else cnt2++;
        // }
        // for(int i =0 ; i<cnt0 ; i++)arr[i]=0;
        // for(int i =cnt0 ; i<cnt0+cnt1 ; i++)arr[i]=1;
        // for(int i =cnt0+cnt1 ; i< arr.length ; i++)arr[i]=2;
        int low =0, mid=0, high=arr.length-1;
        while(mid <= high){
            if(arr[mid] ==0){
                int temp = arr[low];
                arr[low]= arr[mid];
                arr[mid]= temp;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp = arr[high];
                arr[high]= arr[mid];
                arr[mid]= temp;
                high--;
            }
        } 
    }
    public static void main(String[] args) {
        int[] nums = { 1, 0, 2, 1, 0 ,0,2,1};

        Solution obj = new Solution();
        SortZeroOneTwo.sort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
