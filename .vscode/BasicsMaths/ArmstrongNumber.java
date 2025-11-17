import java.util.Scanner;

public class ArmstrongNumber {
    public void num(int n) {
        int num = n;
        int sum = 0;
        int k = String.valueOf(num).length();

        while (n > 0) {
            int digit = n % 10;
            sum += (int)Math.pow(digit, k);
            n /= 10;
        }

        if (num == sum) {
            System.out.println(num + " is Armstrong");
        } else {
            System.out.println(num + " is Not Armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArmstrongNumber r = new ArmstrongNumber();
        r.num(n);
    }
}