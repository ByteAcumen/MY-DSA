import java.util.*;

public class NtoOne {

    public void num(int current) {
        if (current < 0)
            return;
        System.out.println(current);
        num(current - 1);
    }

    public static void main(String[] args) {
        NtoOne print = new NtoOne();
        print.num(10);
    }
}
