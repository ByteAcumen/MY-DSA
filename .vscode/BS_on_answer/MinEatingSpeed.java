
class Solution {

    
    public int calculateHours(int[] a, int speed) {
        int totalHours = 0;

        for (int pile : a) {
            totalHours += (pile + speed - 1) / speed;
        }
        return totalHours;
    }

    // Function to find minimum eating speed
    public int minEatingSpeed(int[] a, int h) {
        // int max = 0;
        // for(int num : a){
        //     max = Math.max(max, num);
        // }
        // for(int i = 1; i <= max ; i++){
        //     int hours = calculateHours(a, i);
        //     if (hours <= h) {
        //         return i;
        //     }
        // }
        // return max;

        int max = 0;
        for (int num : a) {
            max = Math.max(max, num);
        }

        // IMPORTANT FIX: low should be 1 (not 0)
        int low = 1, high = max, ans = max;

        while (low <= high) {
            int mid = (low + high) / 2;

            int totalh = calculateHours(a, mid);

            if (totalh <= h) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}

public class MinEatingSpeed {
    public static void main(String[] args) {

        int[] a = {3, 6, 7, 11};
        int h = 8;

        Solution obj = new Solution();
        int result = obj.minEatingSpeed(a, h);

        System.out.println("Minimum Eating Speed: " + result);
    }
}