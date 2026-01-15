import java.util.*;


public class MajorityElement {

    public int Element(int[] arr) {
        int n = arr.length;
        // int count = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (arr[i] == arr[j]) {
        //             count++;
        //         }
        //     }
        //     if (count > n / 2) {
        //         return arr[i];
        //     }
        // }
        // return -1;

        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int num : arr){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     if(entry.getValue() > n/2){
        //         return entry.getKey();
        //     }
        // }
        // return -1;

        int count = 0;
        int el = 0;
        for(int i = 0;i < n ; i ++){
            if(count == 0){
                count = 1;
                el = arr[i];
            }
            else if(arr[i] == el){
                count++;
            }
            else{
                count--;
            }
        }
        int count1 = 0;
        for(int i = 0; i < n ;i++){
            if(arr[i] == el){
                count1++;
            }
        }
        if(count1 > n/2){
            return el;
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };

        // Create an instance of Solution class
        MajorityElement sol = new MajorityElement();

        int ans = sol.Element(arr);

        // Print the majority element found
        System.out.println("The majority element is: " + ans);
    }
}
