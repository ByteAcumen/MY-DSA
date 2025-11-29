import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLL {

    Node head = null;

    // Creating a Circular LL
    public Node createLL(int[] arr) {
        if (arr == null || arr.length == 0)
            return null;
        head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }
        temp.next = head;
        return head;
    }

    // Printing LL
    public void printLL(Node head) {
        if (head == null)
            return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Size of the LL
    public int size(Node head) {
        Node temp = head;
        int count = 0;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    // Insert at the Head
    public void insertAtHead(int val) {
        Node t = new Node(val);
        if (head == null) {
            head = t;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = t;
        t.next = head;
        head = t;
    }

    // Insert at the end
    public void insertAtEnd(int val) {
        Node t = new Node(val);
        if (head == null) {
            head = t;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = t;
        t.next = head;
    }

    // Insert at Given Index
    public void insertAtIndex(int idx, int val) {
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        Node t = new Node(val);
        t.next = temp.next;
        temp.next = t;
    }

    // Delete at Head
    public void deleteHead() {
        if (head == null)
            return;

        if (head.next == head) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
    }

    // Delete at End
    public void deleteEnd() {
        if (head == null)
            return;
        if (head.next == head) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
    }

    // Delete at Index
    public void deleteAtIndex(int idx) {
        if (idx == 0) {
            deleteHead();
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        CircularLL list = new CircularLL();
        Node head = list.createLL(arr);
        list.printLL(head);
        int val = sc.nextInt();
        // list.insertAtHead(val);
        // head = list.head;
        // list.printLL(head);
        list.insertAtEnd(val);
        head = list.head;
        list.printLL(head);
    }

}
