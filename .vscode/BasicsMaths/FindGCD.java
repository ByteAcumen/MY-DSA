import java.util.*;

public class FindGCD {
    // public void num(int n, int m) {
    //     int gcd = 1;
    //     for (int i = 1; i <= Math.min(n, m); i++) {
    //         if (n % i == 0 && m % i == 0) {
    //             gcd = i;
    //         }
    //     }
    //     System.out.println("GCD is: " + gcd);
    // }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        FindGCD c = new FindGCD();
        System.out.println(c.gcd(n, m));
    }
}