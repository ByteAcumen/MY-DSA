import java.util.Scanner;

public class Sum {

    public void num(int sum, int n) {
        if (n == 0) {
            System.out.println(sum); 
            return;
        }
        num(sum + n, n - 1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        Sum result = new Sum();
        result.num(0, n); 
    }
}