public class BSTInsert {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert a new value into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            // Empty place found, create new node
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val); // go left
        } else if (val > root.data) {
            root.right = insert(root.right, val); // go right
        }

        // return unchanged node pointer
        return root;
    }

    // Inorder Traversal (Left, Root, Right)
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Inorder Traversal of BST:");
        inorder(root);
    }
}
