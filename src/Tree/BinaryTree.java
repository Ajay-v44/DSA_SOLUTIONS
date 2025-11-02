package Tree;

public class BinaryTree {
    public static void preOrderTraversal(Node node) {
        if (node == null)
            return;
        System.out.printf("%d", node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void inOrderTraversal(Node node) {
        if (node == null)
            return;
        inOrderTraversal(node.left);
        System.out.printf("%d", node.data);
        inOrderTraversal(node.right);
    }


    public static void postOrderTraversal(Node node) {
        if (node == null)
            return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.printf("%d", node.data);

    }

    public static void main(String[] args) {

        // The structure to be created:
        //       1
        //      / \
        //     2   3
        //    / \   \
        //   4   5   6

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);
//        1,2,4,5,3,6
        preOrderTraversal(root);
        System.out.println();

//        425136
        inOrderTraversal(root);
        System.out.println();
//      452631
        postOrderTraversal(root);
    }
}
