public class StackClass {
    // Node class for stack elements
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class
    static class Stack {
        private Node head;  // top of the stack

        // Check if stack is empty
        public boolean isEmpty() {
            return head == null;
        }

        // Push element onto stack
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Pop element from stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek at top element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return head.data;
        }
    }

    // Main method to test stack
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop());       // 30
        System.out.println("Popped: " + stack.pop());       // 20
        System.out.println("Popped: " + stack.pop());       // 10
        System.out.println("Popped: " + stack.pop());       // Stack empty
    }
}
