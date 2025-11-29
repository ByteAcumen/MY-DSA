import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyPalindrome {

    Node head = null;

    // Create Doubly Linked List from array
    public Node createLL(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }

        return head;
    }

    // Print DLL forward
    public void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Print DLL reverse
    public void printRev(Node head) {
        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // 👉 You will write the palindrome logic here
    public boolean isPalindrome(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node t = head;
        while (temp != t ) {
            if(t.data != temp.data) return false;
            t= t.next;
            temp = temp.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // number of elements
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // list elements
        }

        DoublyPalindrome dp = new DoublyPalindrome();
        Node head = dp.createLL(arr);

        dp.printLL(head);

        boolean result = dp.isPalindrome(head);
        System.out.println(result);
    }
}
