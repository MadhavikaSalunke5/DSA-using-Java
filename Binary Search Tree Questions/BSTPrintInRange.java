public class BSTPrintInRange {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert into BST
    public static Node insert(Node root, int val) {
        if (root == null) return new Node(val);

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Print nodes in given range
    public static void printInRange(Node root, int x, int y) {
        if (root == null) return;

        // If root's value is greater than x, check left subtree
        if (root.data > x) {
            printInRange(root.left, x, y);
        }

        // If root is in range, print it
        if (root.data >= x && root.data <= y) {
            System.out.print(root.data + " ");
        }

        // If root's value is less than y, check right subtree
        if (root.data < y) {
            printInRange(root.right, x, y);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = {8, 5, 10, 3, 6, 11, 4};

        // Build BST
        for (int val : values) {
            root = insert(root, val);
        }

        int x = 6, y = 10;
        System.out.println("Nodes in range [" + x + ", " + y + "]:");
        printInRange(root, x, y);
    }
}
