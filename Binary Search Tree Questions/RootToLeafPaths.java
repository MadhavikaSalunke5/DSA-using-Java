import java.util.*;

public class RootToLeafPaths {
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

    // Print all root-to-leaf paths
    public static void printPaths(Node root, List<Integer> path) {
        if (root == null) return;

        // Add current node to path
        path.add(root.data);

        // If leaf node, print the path
        if (root.left == null && root.right == null) {
            System.out.println(path);
        } else {
            // Otherwise, go deeper
            printPaths(root.left, new ArrayList<>(path));
            printPaths(root.right, new ArrayList<>(path));
        }
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = {8, 5, 10, 3, 6, 11, 4};

        // Build BST
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Root-to-Leaf Paths:");
        printPaths(root, new ArrayList<>());
    }
}
