
import java.util.Scanner;

public class Factorial {

    public int fact(int num) {
        if(num == 0 || num == 1) return 1;
        return num * fact(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial f = new Factorial();
        int result = f.fact(n);
        System.out.println(result);
    }
}
