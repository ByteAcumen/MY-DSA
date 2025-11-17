import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head = null;
    Node tail = null;
    
    // creating a LinkedList
    public Node createLL(int[] arr){
        
        if(arr == null || arr.length == 0){
            return null;
        }
        head = new Node(arr[0]);
        tail = head;
        for(int i = 1 ;i < arr.length;i++){
            Node newNode = new Node(arr[i]);
            tail.next = newNode;
            tail = newNode;  
        }
        return head;
    }
    
    
    //printing a LinkedList
    public void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    
    //Size of the LinkedList
    public int size(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    //Find the middle of teh linked list
    public Node MiddleElement(Node head){
        Node fast = head;
        Node slow = head;
        while (fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}

public class MiddleOfLL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        LinkedList list = new LinkedList();
        Node head = list.createLL(arr);
        list.printLL(head);
        Node val = list.MiddleElement(head);
        System.out.println(val.data);
    }
    
}
