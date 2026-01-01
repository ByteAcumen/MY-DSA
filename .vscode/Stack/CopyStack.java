import java.util.*;

public class CopyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++ ){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            // rt.push(st.pop());
            int x = st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println(rt);

        Stack<Integer> gt = new Stack<>();
        while (rt.size() > 0) {
            gt.push(rt.pop());
        }
        System.out.println(gt);

    }
}
