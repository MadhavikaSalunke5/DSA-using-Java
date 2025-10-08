import java.util.*;

public class QueueCollection {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<Integer> q = new LinkedList<>();

        // Enqueue (add elements)
        q.add(10);
        q.add(20);
        q.add(30);

        // Display queue
        System.out.println("Queue: " + q);

        // Peek (front element)
        System.out.println("Peek: " + q.peek()); // 10

        // Dequeue (remove elements)
        System.out.println("Removed: " + q.remove()); // 10
        System.out.println("Queue after remove: " + q);

        // Another remove
        System.out.println("Removed: " + q.remove()); // 20
        System.out.println("Queue after remove: " + q);

        // Check if empty
        System.out.println("Is queue empty? " + q.isEmpty());
    }
}
