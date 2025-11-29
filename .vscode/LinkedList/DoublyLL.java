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

public class DoublyLL {

    Node head = null;

    // creating a doubly LinkeList

    public Node createLL(int[] arr) {

        if (arr == null || arr.length == 0)
            return null;

        head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            Node t = new Node(arr[i]);
            temp.next = t;
            t.prev = temp;
            temp = t;
        }
        return head;
    }

    // Print the doubly LinkedList

    public void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Print the reverse LinkedList

    public void printRev(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Return the node at give index
    public Node getAt(int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Print the LL
    public void random(Node random) {
        Node temp = random;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Inserting at the Start
    public void insertAtHead(int idx) {
        Node temp = new Node(idx);
        temp.next = head;
        head.prev = temp;
        head = temp;
    }

    // Insert at the End
    public void insertAtEnd(int idx) {
        Node t = new Node(idx);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = t;
        t.prev = temp;
        t = temp;
    }

    // Insert at given Index
    public void InsertAtIndex(int idx, int val) {
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        Node t = new Node(val);
        Node n = temp.next;
        temp.next = t;
        t.prev = temp;
        t.next = n;
        n.prev = t;
    }

    public int size(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Delete At given Index
    public void deleteAtIndex(int idx) {
        Node temp = head;
        if (idx == 0) {
            head = head.next;
            if (head != null)
                head.prev = null;
            return;
        } else if (idx == size(head) - 1) {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev.next = null;
            return;
        } else {
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        DoublyLL list = new DoublyLL();
        Node head = list.createLL(arr);
        list.printLL(head);
        // list.printRev(head);
        int idx = sc.nextInt();
        // Node random = list.getAt(idx, head);
        // list.random(random);
        // list.insertAtEnd(idx);
        // head = list.head;
        // list.printLL(head);
        // list.InsertAtIndex(idx, 30);
        // head = list.head;
        // list.printLL(head);
        list.deleteAtIndex(idx);
        head = list.head;
        list.printLL(head);
    }

}
