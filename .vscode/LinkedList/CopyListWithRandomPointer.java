import java.util.*;

// Node definition
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Node head2 = new Node(0);
        Node temp1 = head;
        Node temp2 = head2;

        // Step 1: Create copied list
        while (temp1 != null) {
            Node temp = new Node(temp1.val);
            temp2.next = temp;
            temp2 = temp;
            temp1 = temp1.next;
        }
        head2 = head2.next;

        // Step 2: Interleave
        temp1 = head;
        temp2 = head2;
        while (temp1 != null && temp2 != null) {
            Node next1 = temp1.next;
            Node next2 = temp2.next;
            temp1.next = temp2;
            temp2.next = next1;
            temp1 = next1;
            temp2 = next2;
        }

        // Step 3: Copy random pointers
        Node curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            } else {
                curr.next.random = null;
            }
            curr = curr.next.next;
        }

        // Step 4: Separate the lists  (FIXED)
        temp1 = head;
        temp2 = head2;

        while (temp1 != null && temp2 != null) {

            temp1.next = temp2.next;
            temp1 = temp1.next;

            if (temp1 != null) {
                temp2.next = temp1.next;
            } else {
                temp2.next = null;
            }

            temp2 = temp2.next;
        }

        return head2;
    }
}


// Main class matches the file name
public class CopyListWithRandomPointer {

    // Build list from array input
    public static Node buildList(int[][] arr) {
        if (arr.length == 0) return null;

        Node[] nodes = new Node[arr.length];

        // Create all nodes
        for (int i = 0; i < arr.length; i++) {
            nodes[i] = new Node(arr[i][0]);
        }

        // Set next pointers
        for (int i = 0; i < arr.length - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }

        // Set random pointers
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = arr[i][1];
            if (randomIndex != -1) {
                nodes[i].random = nodes[randomIndex];
            }
        }

        return nodes[0];
    }

    // Print list in LeetCode format
    public static void printList(Node head) {
        Map<Node, Integer> indexMap = new HashMap<>();
        Node temp = head;
        int idx = 0;

        while (temp != null) {
            indexMap.put(temp, idx++);
            temp = temp.next;
        }

        temp = head;
        System.out.print("[");
        while (temp != null) {
            Integer randomIndex = (temp.random == null) ? null : indexMap.get(temp.random);
            System.out.print("[" + temp.val + "," + randomIndex + "]");
            temp = temp.next;
            if (temp != null) System.out.print(",");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        // Example input: [[7,null],[13,0],[11,4],[10,2],[1,0]]
        int[][] arr = {
            {7, -1},
            {13, 0},
            {11, 4},
            {10, 2},
            {1, 0}
        };

        Node head = buildList(arr);

        System.out.println("Original list:");
        printList(head);

        Solution sol = new Solution();
        Node copied = sol.copyRandomList(head);

        System.out.println("Copied list:");
        printList(copied);
    }
}
