public class MissingNumber {

    public int missingValue(int[] arr, int N) {

        // for (int i = 1; i <= N; i++) {
        // boolean found = false;
        // for (int j = 0; j < N - 1; j++) {
        // if (arr[j] == i) {
        // found = true;
        // break;
        // }
        // }
        // if (!found)
        // return i;
        // }
        // return -1;

        // int sum1 = N*(N+1)/2;
        // int sum2 = 0;
        // for(int i = 0; i < a.length ;i++){
        // sum2 += a[i];
        // }
        // return sum1-sum2;

        int XOR1 = 0;
        int XOR2 = 0;
        for (int i = 0; i < N - 1; i++) {
            XOR2 ^= arr[i];
            XOR1 ^= (i + 1);
        }
        XOR1 ^= N;
        return XOR1 ^ XOR2;

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5 };
        int N = 5;

        MissingNumber obj = new MissingNumber();
        int ans = obj.missingValue(a, N);
        System.out.println("The missing number is: " + ans);
    }

}
