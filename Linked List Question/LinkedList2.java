import java.util.*;

class LinkedList2 {
    Node head; // head node of the list

    // Inner class Node
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add node at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Print linked list
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // ----------------------------------------------------
    // 1. Iterative Method
    // ----------------------------------------------------
    public void reverseIterative() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;  // save next
            currNode.next = prevNode;       // reverse link
            prevNode = currNode;            // move prev forward
            currNode = nextNode;            // move curr forward
        }

        head.next = null;  // old head becomes tail
        head = prevNode;   // new head
    }

    // ----------------------------------------------------
    // 2. Recursive Method
    // ----------------------------------------------------
    public Node reverseRecursive(Node head) {
        // Base case: empty list or single node
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);

        head.next.next = head;  // reverse link
        head.next = null;

        return newHead;
    }

    public void reverseRecursiveCaller() {
        head = reverseRecursive(head);
    }

    // ----------------------------------------------------
    // 3. Using Collections
    // ----------------------------------------------------
    public void reverseUsingCollections() {
        LinkedList <Integer> list2 = new LinkedList<>();

        // copy linked list elements into list2
        Node curr = head;
        while (curr != null) {
            list2.add(curr.data);
            curr = curr.next;
        }

        // reverse using Collections
        Collections.reverse(list2);

        // rebuild linked list
        head = null;
        for (int val : list2) {
            addLast(val);
        }
    }

    // ----------------------------------------------------
    // Main method
    // ----------------------------------------------------
    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println("Original List:");
        list.printList();

        // Iterative reverse
        list.reverseIterative();
        System.out.println("Reversed Iterative:");
        list.printList();

        // Recursive reverse
        list.reverseRecursiveCaller();
        System.out.println("Reversed Recursive:");
        list.printList();

        // Using Collections
        list.reverseUsingCollections();
        System.out.println("Reversed Using Collections:");
        list.printList();
    }
}
