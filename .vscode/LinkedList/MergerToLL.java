import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MergerToLL {

    // You will write this method
    public Node mergeTwoLists(Node list1, Node list2) {
        Node head = new Node(0);
        Node temp = head;
        Node temp1 = list1;
        Node temp2 = list2;

        // merge while both present
        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                Node a = new Node(temp1.data);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            } else {
                Node a = new Node(temp2.data);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }
        if (temp1 != null)
            temp.next = temp1;
        if (temp2 != null)
            temp.next = temp2;

        return head.next;
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

        // List 1
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++)
            a1[i] = sc.nextInt();

        // List 2
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++)
            a2[i] = sc.nextInt();

        MergerToLL obj = new MergerToLL();

        Node list1 = obj.createLL(a1);
        Node list2 = obj.createLL(a2);

        Node merged = obj.mergeTwoLists(list1, list2);

        obj.printLL(merged);
    }
}
