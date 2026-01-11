import java.util.Scanner;
import java.util.Stack;

public class RemoveBrackets {

    public static int remove(String str) {
        Stack<Character> stack = new Stack<>();
        int extraClosing = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } 
            else if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); 
                } else {
                    extraClosing++;
                }
            }
        }

        return stack.size() + extraClosing;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(remove(str));
    }
}
