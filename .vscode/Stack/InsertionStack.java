import java.util.*;

public class InsertionStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++ ){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        int idx = sc.nextInt();
        int val = sc.nextInt();

        Stack<Integer> temp = new Stack<>();
        while (st.size() > idx) {
            temp.push(st.pop());
        }
        System.out.println(temp);
        st.push(val);
        while(temp.size() > 0){
            st.push(temp.pop());
        }
        System.out.println(st);

    }
}
