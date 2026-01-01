import java.util.Scanner;
import java.util.Stack;

public class RemoveBottom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 1; i <= n; i++) {
            int val = sc.nextInt();
            st.push(val);
        }
        System.out.println(st);
        int idx = sc.nextInt();
        Stack<Integer> rt = new Stack<>();
        while (st.size() > idx) {
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size() > 0){
            st.push(rt.pop());
        }
        System.out.println(st);

    }
    
}
