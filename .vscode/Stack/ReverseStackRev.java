import java.util.Scanner;
import java.util.Stack;

public class ReverseStackRev {

    // public static void pushAtBottom(Stack<Integer> st, int x) {
    //     if (st.isEmpty()) {
    //         st.push(x);
    //         return;
    //     }
    //     int top = st.pop();
    //     pushAtBottom(st, x);
    //     st.push(top);
    // }

    // public static void reverse(Stack<Integer> st) {
    //     if (st.size() == 0)
    //         return;
    //     int top = st.pop();
    //     reverse(st);
    //     pushAtBottom(st, top);
    // }

    public static void reverseRecursively(Stack<Integer> st, Stack<Integer> temp) {
        if (st.isEmpty()) {
            return;
        }

        temp.push(st.pop());
        reverseRecursively(st, temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 1; i <= n; i++) {
            int val = sc.nextInt();
            st.push(val);
        }
        Stack<Integer> temp = new Stack<>();
        System.out.println(st);
        reverseRecursively(st,temp);
        System.out.println(temp);
    }

}
