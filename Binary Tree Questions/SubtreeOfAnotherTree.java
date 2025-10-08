public class SubtreeOfAnotherTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Check if two trees are identical
    public static boolean isSameTree(Node s, Node t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;

        return (s.data == t.data) &&
               isSameTree(s.left, t.left) &&
               isSameTree(s.right, t.right);
    }

    // Check if t is a subtree of s
    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) return false;

        if (isSameTree(root, subRoot)) return true;

        // Check left or right subtree
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        // Build main tree
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(2);

        // Build subtree
        Node subRoot = new Node(4);
        subRoot.left = new Node(1);
        subRoot.right = new Node(2);

        if (isSubtree(root, subRoot)) {
            System.out.println("subRoot is a subtree of root");
        } else {
            System.out.println("subRoot is NOT a subtree of root");
        }
    }
}
