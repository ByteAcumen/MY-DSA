import java.util.*;

public class PrintName {

    public void printNamerec(String s , int n){
        if(n == 0) return;
        System.out.println(s);
        printNamerec(s, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        PrintName print = new PrintName();
        print.printNamerec(s, n);
    }
}
