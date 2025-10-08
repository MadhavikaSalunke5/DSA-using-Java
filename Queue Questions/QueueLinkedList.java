public class QueueLinkedList {
    // Node class for linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue class
    static class Queue {
        static Node head = null;  // front of the queue
        static Node tail = null;  // rear of the queue

        // Check if queue is empty
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // Add element (enqueue)
        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (tail == null) { // queue is empty
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Remove element (dequeue)
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;
            head = head.next; // move head to next node

            if (head == null) { // queue becomes empty
                tail = null;
            }

            return front;
        }

        // Peek (see front element)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        // Display elements
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            Node temp = head;
            System.out.print("Queue elements: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); // 10 20 30

        System.out.println("Dequeued: " + q.dequeue());
        q.display(); // 20 30

        System.out.println("Peek: " + q.peek()); // 20

        q.enqueue(40);
        q.enqueue(50);
        q.display(); // 20 30 40 50

        System.out.println("Dequeued: " + q.dequeue());
        q.display(); // 30 40 50
    }
}
