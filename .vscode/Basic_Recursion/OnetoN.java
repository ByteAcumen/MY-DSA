import java.util.*;

public class OnetoN {

    public void num(int current, int n) {
        if (current > n)
            return;
        System.out.println(current);
        num(current + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        OnetoN print = new OnetoN();
        print.num(0,n);
    }
}
