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

public class DoublyTwoSum {

    Node head = null;

    // Create Doubly Linked List from array
    public Node createLL(int[] arr) {
        if (arr == null || arr.length == 0)
            return null;

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

    // 👉 You will write this logic yourself
    // Return true/false or print the pair — up to you
    public boolean twoSum(Node head, int target) {
        Node temp = head;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node t = tail;
        while (temp != null && t != null && temp != t && t.next != temp) {
            int sum = temp.data + t.data;

            if (sum == target)
                return true;
            else if (sum > target)
                t = t.prev;
            else
                temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of elements
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // list elements
        }

        int target = sc.nextInt(); // target sum

        DoublyTwoSum dts = new DoublyTwoSum();
        Node head = dts.createLL(arr);

        dts.printLL(head);

        boolean result = dts.twoSum(head, target);
        System.out.println(result); // You decide output format
    }
}
