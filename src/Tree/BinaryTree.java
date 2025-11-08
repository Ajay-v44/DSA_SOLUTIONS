package Tree;

public class BinaryTree {
    public static int idx=-1;

    public static  Node buildBinaryTree(int[] nodes){
        idx++;
        if (idx>= nodes.length||nodes[idx]==-1)
            return null;
        Node newNode=new Node(nodes[idx]);
        newNode.left=buildBinaryTree(nodes);
        newNode.right=buildBinaryTree(nodes);
        return newNode;
    }

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

    public static int findDepth(Node node) {
        if (node == null) {
            return 0;
        }
        int countLeft = findDepth(node.left);
        int countRight = findDepth(node.right);
        return 1 + Math.max(countRight, countLeft);
    }

    public static void main(String[] args) {

        // The structure to be created:
        //       1
        //      / \
        //     2   3
        //    / \   \
        //   4   5   6

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildBinaryTree(nodes);
//        root.left = new Node(2);
//        root.right = new Node(3);
//
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//
//        root.right.right = new Node(6);
//        1,2,4,5,3,6
        preOrderTraversal(root);
        System.out.println();

//        425136
        inOrderTraversal(root);
        System.out.println();
//      452631
        postOrderTraversal(root);
        System.out.println();
        System.out.println(findDepth(root));
    }
}
