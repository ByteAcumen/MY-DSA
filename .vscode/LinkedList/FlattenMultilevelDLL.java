import java.util.*;

class Node {
    int val;
    Node next;
    Node prev;
    Node child;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
        this.child = null;
    }
}

public class FlattenMultilevelDLL {

    Node head = null;

    // Create only single level DLL from array (children added manually)
    public Node createDLL(int[] arr) {
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

    // Print forward (child pointers are ignored)
    public void printForward(Node head) {
        Node t = head;
        while (t != null) {
            System.out.print(t.val + " ");
            t = t.next;
        }
        System.out.println();
    }

    // Print backward
    public void printBackward(Node head) {
        if (head == null) return;

        Node t = head;
        while (t.next != null) {
            t = t.next;
        }

        while (t != null) {
            System.out.print(t.val + " ");
            t = t.prev;
        }
        System.out.println();
    }

    // YOU WILL WRITE THIS METHOD
    public Node flatten(Node head) {
        Node temp = head;
        while (temp != null) {
            Node t = temp.next;
            if(temp.child != null){
                Node c = flatten(temp.child);
                temp.next = c;
                c.prev = temp;
                while (c.next != null) {
                    c = c.next;
                }
                c.next = t;
                if(t != null) t.prev = c;
            }
            temp.child = null;
            temp = t;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // main list
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        FlattenMultilevelDLL fm = new FlattenMultilevelDLL();
        Node head = fm.createDLL(arr);

        // number of child pointers we want to add manually
        int childCount = sc.nextInt();

        // manually define child pointers (index + child array)
        // Example:
        // 1
        // 2
        // → means: at node index 1 attach child list [2]

        for (int i = 0; i < childCount; i++) {
            int idx = sc.nextInt();  // where to attach child
            int size = sc.nextInt(); // child list size
            int childArr[] = new int[size];
            for (int j = 0; j < size; j++) childArr[j] = sc.nextInt();

            // create child DLL
            Node childHead = fm.createDLL(childArr);

            // attach it
            Node temp = head;
            for (int k = 0; k < idx; k++) temp = temp.next;
            temp.child = childHead;
        }

        System.out.println("Original Multilevel DLL:");
        fm.printForward(head);

        // flatten
        head = fm.flatten(head);

        System.out.println("Flattened DLL:");
        fm.printForward(head);
        fm.printBackward(head);
    }
}
