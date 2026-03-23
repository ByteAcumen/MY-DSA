
public class floorSqrt {

    public int sqrtFloor(int n) {
        // int ans = 0;
        // for (int i = 0; i <= n; i++) {
        //     if ((long)i * i <= n) {
        //         ans = i;
        //     } else {
        //         break;
        //     }
        // }
        // return ans;

        if(n < 2) return n;
        int low = 0,high = n/2,ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if((mid * mid) <= n){
                ans = mid;
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 36;

        floorSqrt obj = new floorSqrt();

        System.out.println(obj.sqrtFloor(n));
    }
}