import java.util.Stack;

public class QueueUsing2Stacks {  
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Enqueue (add element to queue)
        public void enqueue(int data) {
            s1.push(data);
        }

        // Dequeue (remove element from queue)
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            // If s2 is empty, move all elements from s1 to s2
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            // Now pop from s2
            return s2.pop();
        }

        // Peek (front element)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.peek();
        }

        // Check if queue is empty
        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeued: " + q.dequeue()); // 10
        System.out.println("Peek: " + q.peek());        // 20
        System.out.println("Dequeued: " + q.dequeue()); // 20
        System.out.println("Dequeued: " + q.dequeue()); // 30
        System.out.println("Dequeued: " + q.dequeue()); // Queue empty
    }
}
