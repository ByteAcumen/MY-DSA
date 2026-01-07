import java.util.Stack;

public class LLImpementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class LLStack{
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack Underflow");
                return -1;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        void displayrec(Node h){
            if(h == null){
                return;
            }
            displayrec(h.next);
            System.out.print(h.data + " ");
        }

        void display(){
            displayrec(head);
            System.out.println();
        }

        void displayRev(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int peek(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.data;
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size == 0){
                return true;
            }
            return false;
        }

    }

    public static void main(String[] args) {

        LLStack st = new LLStack();

        st.push(5);
        st.display(); // 5

        st.push(4);
        st.display(); // 5 4

        st.push(3);
        st.display(); // 5 4 3

        st.push(2);
        st.display(); // 5 4 3 2

        st.push(1);
        st.display(); // 5 4 3 2 1

        // System.out.println(st.isFull());

        System.out.println(st.size()); // 5
        System.out.println(st.peek()); // 1
        System.out.println(st.pop()); // 1

        st.display(); // 5 4 3 2
        System.out.println(st.size()); // 4

        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }

}
