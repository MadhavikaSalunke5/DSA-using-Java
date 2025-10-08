public class CircularQueue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        // check if queue is empty
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // check if full
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add (enqueue)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // first element add
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size; // move rear circularly
            arr[rear] = data;
        }

        // Remove (dequeue)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front]; // element to remove

            // only one element case
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size; // move front circularly
            }
            return result;
        }

        // Peek (get front element)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        // Display queue
        public static void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue elements: ");
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    // main method to test queue
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.display(); // 10 20 30

        System.out.println("Removed: " + q.remove()); // removes 10
        q.display(); // 20 30

        System.out.println("Peek: " + q.peek()); // 20

        q.add(40);
        q.add(50);
        q.add(60); // now queue is full
        q.display(); // 20 30 40 50 60

        q.add(70); // should print "Queue is full"

        System.out.println("Removed: " + q.remove()); // removes 20
        q.display(); // 30 40 50 60

        q.add(70);
        q.display(); // 30 40 50 60 70
    }
}
