import java.util.*;

public class Palindrome {
    public void num(int n) {
        if (n < 0) {
            System.out.println("Not Palindrome"); 
            return;
        }

        int rev = 0;
        int dup = n;
        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n /= 10;
        }

        if (rev == dup) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Palindrome r = new Palindrome();
        r.num(n);
    }
}