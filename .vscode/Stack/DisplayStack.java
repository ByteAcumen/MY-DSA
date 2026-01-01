import java.util.*;

public class DisplayStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i = 1 ; i <= n ; i++){
            st.push(i);
        }
        System.out.println(st);
        int x = st.size();
        int[] arr = new int[x];
        for(int i = x-1 ; i >= 0 ; i-- ){
            arr[i] = st.pop();
        }
        for(int i = 0 ; i < x; i++){
            System.out.println(arr[i]+" ");
            st.push(arr[i]);
        }
        System.out.println(st);
    }
    
}
