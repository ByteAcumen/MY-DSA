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
    
    
    //Insert at the End 
    public void insertAtEnd(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp; 
        }
        else{
            tail.next = temp;
            tail = temp;   
        }
    }
    
    //Insert at the start
    public void insertAtStart(int data){
        Node temp = new Node(data);
        
        if(head == null){
            head = temp;
            tail = temp; 
        }
        
        temp.next = head;
        head = temp;
    }
    
    //INsert at the given Index
    public void insertAtIndex(int idx , int data){
        Node temp = new Node(data);
        Node t = head;
        if(idx == size(head)){
            insertAtEnd(data);
            return;
        }
        else if(idx == 0){
            insertAtStart(data);
            return;
        }
        for(int i = 0; i < idx-1;i++){
            t = t.next;
        }
        temp.next = t.next;
        t.next = temp;
    }
    
    //get elemnt at Index
    public int getAt(int idx){
        Node temp = head;
        for(int i = 0 ; i < idx; i++){
            temp = temp.next;
        }
        return temp.data ; 
    }
    
    //delete an element from the given Index
    public void deleteAt(int idx){
        Node temp = head;
        if(idx == 0){
            head = head.next;
        }
        for(int i = 1;i <= idx-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        tail = temp;
    }
}

class Main {
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
        // System.out.println(list.size(head));
        list.insertAtEnd(6);
        list.insertAtStart(0);
        head = list.head;
        list.printLL(head);
        list.insertAtIndex(0,10);
        head = list.head;
        list.printLL(head);
        list.deleteAt(0);
        head = list.head;
        list.printLL(head);
    }
}
