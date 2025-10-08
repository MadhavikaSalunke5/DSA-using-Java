public class SumofNodes {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node BuildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {   // -1 means no node
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }
    }

    // Correct Sum function
    public static int Sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = Sum(root.left);
        int rightNode = Sum(root.right);
        return leftNode + rightNode + root.data;
    }

    

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Node root = BinaryTree.BuildTree(nodes);

        System.out.println("Sum of all nodes = " + Sum(root));
    }
}
