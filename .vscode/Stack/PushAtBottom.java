import java.util.Scanner;
import java.util.Stack;

public class PushAtBottom {

    public static void pushAtBottomRec(Stack<Integer> st , int x , int idx ){
        if(st.size() == idx){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottomRec(st, x ,idx);
        st.push(top);
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
        int x = sc.nextInt();
        int idx = sc.nextInt();
        pushAtBottomRec(st, x , idx);
        System.out.println(st);
    }
}
