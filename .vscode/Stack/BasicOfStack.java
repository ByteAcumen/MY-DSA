import java.util.*;

public class BasicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println("Size is : "+ st.size());
        System.out.println(st);
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("Size is : "+ st.size());

        // 1st elemnet of the stack 
        while(st.size() > 2){
            st.pop();
        }
        System.out.println(st.peek());
    }
}
