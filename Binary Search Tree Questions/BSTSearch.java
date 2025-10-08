public class BSTSearch {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert method (same as before)
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Recursive Search
    public static boolean searchRecursive(Node root, int key) {
        if (root == null) {
            return false; // not found
        }
        if (root.data == key) {
            return true; // found
        }
        if (key < root.data) {
            return searchRecursive(root.left, key);
        } else {
            return searchRecursive(root.right, key);
        }
    }

    // Iterative Search
    public static boolean searchIterative(Node root, int key) {
        while (root != null) {
            if (key == root.data) return true;
            if (key < root.data) root = root.left;
            else root = root.right;
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int val : values) {
            root = insert(root, val);
        }

        int key = 60;

        // Recursive Search
        if (searchRecursive(root, key)) {
            System.out.println(key + " found (Recursive)");
        } else {
            System.out.println(key + " not found (Recursive)");
        }

        // Iterative Search
        key = 25;
        if (searchIterative(root, key)) {
            System.out.println(key + " found (Iterative)");
        } else {
            System.out.println(key + " not found (Iterative)");
        }
    }
}
