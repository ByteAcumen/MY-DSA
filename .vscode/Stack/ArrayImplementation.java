public class ArrayImplementation {

    public static class Stack {
        private int[] arr = new int[5];
        private int idx = 0;   

        void push(int x) {
            if (idx == arr.length) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[idx - 1];
            idx--;
            return top;
        }

        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }

        boolean isEmpty(){
            if(idx == 0) return true;
            return false;
        }

        boolean isFull(){
            if(idx == arr.length) return true;
            return false;
        }
    }

    public static void main(String[] args) {

        Stack st = new Stack();

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

        System.out.println(st.isFull());

        System.out.println(st.size()); // 5
        System.out.println(st.peek()); // 1
        System.out.println(st.pop());  // 1

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
