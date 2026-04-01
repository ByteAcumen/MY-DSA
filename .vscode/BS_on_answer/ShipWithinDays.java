import java.util.*;

public class ShipWithinDays {

    //  Helper method
    public static int daysNeeded(int[] weights, int capacity) {
        int days = 0;
        int currLoad = 0;
        for(int w : weights){
            if(currLoad + w > capacity){
                days++;
                currLoad = w;
            }else{
                currLoad += w;
            }
        }
        return days;
    }

    //  Main function to solve the problem
    public static int shipWithinDays(int[] weights, int days) {
            int left = Arrays.stream(weights).max().getAsInt();
            int right = Arrays.stream(weights).sum();
    
            while(left < right){
                int mid = left + (right - left) / 2;
                if(daysNeeded(weights, mid) <= days){
                    right = mid;
                }else{
                    left = mid + 1;
                }
            }
            return left;
    }

    //  Driver code
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        int result = shipWithinDays(weights, days);
        System.out.println("Minimum capacity required: " + result);
    }
}