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

    public void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node getIntersectionNode(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;

        int lengthA = 0;
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }

        int lengthB = 0;
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;

        if (lengthA > lengthB) {
            int steps = lengthA - lengthB;
            for (int i = 1; i <= steps; i++) {
                tempA = tempA.next;
            }
        } else {
            int steps = lengthB - lengthA;
            for (int i = 1; i <= steps; i++) {
                tempB = tempB.next;
            }
        }

        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;
    }
}

public class Intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        LinkedList listA = new LinkedList();
        LinkedList listB = new LinkedList();

        Node headA = listA.createLL(arr1);
        Node headB = listB.createLL(arr2);

        Node tempA = headA;
        for (int i = 0; i < 2; i++) {
            tempA = tempA.next;
        }

        Node tempB = headB;
        while (tempB.next != null) tempB = tempB.next;
        tempB.next = tempA;

        Node result = listA.getIntersectionNode(headA, headB);

        if (result != null)
            System.out.println(result.data);
        else
            System.out.println("No intersection");
    }
}
