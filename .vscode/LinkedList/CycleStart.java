import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;
    Node tail = null;

    // Create LinkedList from array
    public Node createLL(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        head = new Node(arr[0]);
        tail = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            tail.next = newNode;
            tail = newNode;
        }
        return head;
    }

    // Create a cycle at position `pos` (0-indexed)
    public void createCycle(Node head, int pos) {
        if (pos == -1) return;

        Node cycleNode = null;
        Node temp = head;
        int index = 0;

        while (temp.next != null) {
            if (index == pos) cycleNode = temp;
            temp = temp.next;
            index++;
        }

        if (cycleNode != null) {
            temp.next = cycleNode;
        }
    }

    // TODO: Implement this method to return the node where the cycle begins
    public Node detectCycle(Node head) {
        if(head == null || head.next == null) return null;
        Node fast = head;
        Node slow = head;
        Node temp = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                while (slow != temp) {
                    slow = slow.next;
                    temp = temp.next;
                }
            }return slow;
        }
        return null;
    }
}

public class CycleStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = sc.nextInt(); // Position to create cycle (-1 means no cycle)

        LinkedList list = new LinkedList();
        Node head = list.createLL(arr);
        list.createCycle(head, pos);

        Node cycleStart = list.detectCycle(head);

        if (cycleStart != null) {
            System.out.println("tail connects to node with value: " + cycleStart.data);
        } else {
            System.out.println("no cycle");
        }
    }
}