import java.util.*;

public class count {
    public void numCount(int n) {
        int count = 0;
        n = Math.abs(n); 
        if (n == 0) {
            count = 1;
        } else {
            while (n > 0) {
                count++;
                n /= 10;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        count c = new count();
        c.numCount(n);
    }
}