import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queue {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // Push element onto stack
        public void push(int data) {
            // Step 1: Add new element to q2
            q2.add(data);

            // Step 2: Move all elements from q1 to q2
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            // Step 3: Swap q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        // Pop element from stack
        public int pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.remove();
        }

        // Peek (top element)
        public int peek() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.peek();
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return q1.isEmpty();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek()); // 30
        System.out.println("Popped: " + s.pop());       // 30
        System.out.println("Popped: " + s.pop());       // 20
        System.out.println("Top element: " + s.peek()); // 10
        System.out.println("Popped: " + s.pop());       // 10
        System.out.println("Popped: " + s.pop());       // empty
    }
}
