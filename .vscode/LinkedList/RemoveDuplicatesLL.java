import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class RemoveDuplicatesLL {

    // 👉 You will write this logic
    public Node deleteDuplicates(Node head) {
        Node temp = head;
        while (temp != null && temp.next != null) {
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            if(temp.next == null) return head;
            if(temp.data != temp.next.data){
                temp = temp.next;
            }
        }
        return head;
    }

    // Create Linked List from array
    public Node createLL(int[] arr) {
        if (arr.length == 0) return null;

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
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        RemoveDuplicatesLL obj = new RemoveDuplicatesLL();

        Node head = obj.createLL(arr);

        Node ans = obj.deleteDuplicates(head);

        obj.printLL(ans);
    }
}
