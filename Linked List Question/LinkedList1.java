public class LinkedList1 {
    Node head;  // head node of the list

    // Node class (inner class)
    class Node {
        String data; // data of the node
        Node next;   // reference to the next node

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // ----------------------------------------
    // Add element at the beginning
    // ----------------------------------------
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) { // if list is empty
            head = newNode;
            return;
        }
        // link new node to head
        newNode.next = head;
        // move head to point to new node
        head = newNode;
    }

    // ----------------------------------------
    // Add element at the end
    // ----------------------------------------
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) { // if list is empty
            head = newNode;
            return;
        }
        Node currNode = head;
        // traverse until last node
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        // link last node to new node
        currNode.next = newNode;
    }

    // ----------------------------------------
    // Print the linked list
    // ----------------------------------------
    public void PrintList() {
        if (head == null) { // if list is empty
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        // traverse until the end of the list
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("Null"); // mark end of list
    }

    // ----------------------------------------
    // Delete first element
    // ----------------------------------------
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete");
            return;
        }
        head = head.next; // move head to next node
    }

    // ----------------------------------------
    // Delete last element
    // ----------------------------------------
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete");
            return;
        }
        if (head.next == null) { // only one node
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        // traverse to the second last node
        while (lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null; // remove last node
    }

    // ----------------------------------------
    // Main method to test
    // ----------------------------------------
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();

        // Adding nodes
        list.addFirst("A");
        list.addFirst("is");
        list.addLast("Linked");
        list.addLast("List");

        // Print the list
        System.out.println("Original List:");
        list.PrintList();

        // Delete first node
        list.deleteFirst();
        System.out.println("After deleting first:");
        list.PrintList();

        // Delete last node
        list.deleteLast();
        System.out.println("After deleting last:");
        list.PrintList();
    }
}

