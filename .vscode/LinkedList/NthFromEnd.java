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

    //nth node from the end

    // public Node nthfromEnd(Node head,int idx){
    //     int n = size(head);
    //     int steps = n - idx + 1;
    //     Node temp = head;
    //     for(int i = 1; i < steps ;i++){
    //         temp = temp.next;
    //     }
    //     return temp;
    // }

    public Node nthNode(Node head, int idx){
        Node fast = head;
        Node slow = head;
        for(int i = 1; i <= idx;i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }

}

public class NthFromEnd {

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
        Node val = list.nthNode(head, 5);
        System.out.println(val.data);
    }
    
}
