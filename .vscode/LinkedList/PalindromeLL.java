import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class PalindromeLL {

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

    // 👉 You will write this logic
    public boolean isPalindrome(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = reverseList(slow.next);
        slow.next = temp;
        Node p1 = head;
        Node p2 = slow.next;
        while (p2 != null) {
            if(p1.data != p2.data){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
            
        }
        return true;  // temporary return
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

        PalindromeLL obj = new PalindromeLL();

        Node head = obj.createLL(arr);

        boolean ans = obj.isPalindrome(head);

        System.out.println(ans ? "true" : "false");
    }
}
