import java.util.Scanner;
import java.util.Stack;

public class DisplayReverseRec {

    public static void displayStackRev(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayStackRev(st);
        st.push(top);
    }
    public static void displayStack(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        displayStack(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i = 1 ; i <= n ; i++){
            st.push(i);
        }
        System.out.println(st);
        displayStackRev(st);
        System.out.println();
        System.out.println(st);
        displayStack(st);

    }
    
}
