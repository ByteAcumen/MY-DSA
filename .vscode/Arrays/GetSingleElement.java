public class GetSingleElement {

    public int getElement(int[] arr) {
        int n = arr.length;
        // for(int i = 0 ; i < n; i++){
        //     int num = arr[i];
        //     int cnt = 0;
        //     for(int j = 0; j < n;j++){
        //         if(arr[j] == num){
        //             cnt++;
        //         }
        //     }
        //     if(cnt == 1) return num;
        // }
        // return -1;
        
        int xor = 0;
        for(int num : arr){
            xor ^= num;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        GetSingleElement obj = new GetSingleElement();
        int ans = obj.getElement(arr);

        System.out.println("The single element is: " + ans);
    }
}
