import java.util.ArrayList;

public class StackClass1 {
    // Stack class using ArrayList
    static class Stack {
        private ArrayList<Integer> list = new ArrayList<>();

        // Check if stack is empty
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // Push element onto stack
        public void push(int data) {
            list.add(data); // add at the end
        }

        // Pop element from stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return list.remove(list.size() - 1); // remove last element
        }

        // Peek at top element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return list.get(list.size() - 1); // get last element
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
