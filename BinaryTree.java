public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(char data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            insertHelper(root, newNode);
        }
    }

    private void insertHelper(Node current, Node newNode) {
        if (newNode.data < current.data) {
            if (current.left == null) {
                current.left = newNode;
            } else {
                insertHelper(current.left, newNode);
            }
        } else {
            if (current.right == null) {
                current.right = newNode;
            } else {
                insertHelper(current.right, newNode);
            }
        }
    }

    public void preorderTraversal() {
        preorderTraversalHelper(root);
    }

    private void preorderTraversalHelper(Node current) {
        if (current != null) {
            System.out.print(current.data + " ");
            preorderTraversalHelper(current.left);
            preorderTraversalHelper(current.right);
        }
    }

    public void inorderTraversal() {
        inorderTraversalHelper(root);
    }

    private void inorderTraversalHelper(Node current) {
        if (current != null) {
            inorderTraversalHelper(current.left);
            System.out.print(current.data + " ");
            inorderTraversalHelper(current.right);
        }
    }

    public void postorderTraversal() {
        postorderTraversalHelper(root);
    }

    private void postorderTraversalHelper(Node current) {
        if (current != null) {
            postorderTraversalHelper(current.left);
            postorderTraversalHelper(current.right);
            System.out.print(current.data + " ");
        }
    }

    public static class Node {
        private char data;
        private Node left;
        private Node right;

        public Node(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert('B');
        tree.insert('A');
        tree.insert('D');
        tree.insert('C');

        System.out.println("Preorder traversal: ");
        tree.preorderTraversal();
        System.out.println("\nInorder traversal: ");
        tree.inorderTraversal();
        System.out.println("\nPostorder traversal: ");
        tree.postorderTraversal();
    }
}
