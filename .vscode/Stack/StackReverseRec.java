import java.util.Scanner;
import java.util.Stack;

public class StackReverseRec {

    public static void pushAtBottomRec(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottomRec(st, x);
        st.push(top);
    }

    public static void stackRevRecurcive(Stack<Integer> st){
        if(st.size() == 1) return;
        int top = st.pop();
        stackRevRecurcive(st);
        pushAtBottomRec(st, top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 1; i <= n; i++) {
            int val = sc.nextInt();
            st.push(val);
        }
        System.out.println(st);
        stackRevRecurcive(st);
        System.out.println(st);
    }

}
