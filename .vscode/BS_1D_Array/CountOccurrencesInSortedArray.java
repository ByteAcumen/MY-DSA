public class CountOccurrencesInSortedArray {
    
    public static int first(int[] arr,int x){
        int low = 0,high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                ans = mid;
                high = mid-1;
            }else if(arr[mid] < x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static int last(int[] arr,int x){
        int low = 0,high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                ans = mid;
                low = mid+1;
            }else if(arr[mid] < x){
                low = mid+1;
            }else{
                high = mid-1;
            }
            
        }return ans;
    }

    public static int countOccurrences(int[] arr,int x){
        int f = first(arr,x);
        if(f == -1){
            return 0;
        }
        int l = last(arr,x);
        return l-f+1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 3, 3, 3, 4 };
        int X = 3;

        System.out.println(countOccurrences(arr, X));
    }
}
