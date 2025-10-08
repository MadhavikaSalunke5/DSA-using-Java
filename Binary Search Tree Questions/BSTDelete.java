public class BSTDelete {
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

    // Find minimum value node (used in case 3)
    public static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Delete node from BST
    public static Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: One child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3: Two children
            Node successor = findMin(root.right);
            root.data = successor.data; // copy successor value
            root.right = delete(root.right, successor.data); // delete successor
        }
        return root;
    }

    // Inorder traversal (to check tree structure)
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        // Build BST
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Inorder before deletion:");
        inorder(root);
        System.out.println();

        // Delete node examples
        root = delete(root, 20); // Case 1: leaf
        root = delete(root, 30); // Case 2: one child
        root = delete(root, 50); // Case 3: two children

        System.out.println("Inorder after deletion:");
        inorder(root);
    }
}
