import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ReverseLL {

    // 👉 You will write this logic
    // public Node reverseList(Node head) {
    //     if (head == null || head.next == null) {
    //         return head;
    //     }
    //     Node newHead = reverseList(head.next);
    //     head.next.next = head;
    //     head.next = null;

    //     return newHead;
    // }

    public Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        Node after = null;
        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    // Create Linked List from array
    public Node createLL(int[] arr) {
        if (arr.length == 0)
            return null;

        Node head = new Node(arr[0]);
        Node tail = head;

        for (int i = 1; i < arr.length; i++) {
            tail.next = new Node(arr[i]);
            tail = tail.next;
        }
        return head;
    }

    // Print Linked List
    public void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        ReverseLL obj = new ReverseLL();

        Node head = obj.createLL(arr);

        Node ans = obj.reverseList(head);

        obj.printLL(ans);
    }
}
