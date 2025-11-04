package Tree;

public class CountTreeNodes {

    public static int count(Node root, int c) {
        if (root == null)
            return c;
        else
            c++;
        int leftCount = count(root.left, c);
        return count(root.right, leftCount);
    }

    public static int countNodes(Node root) {
        if (root == null)
            return 0;
        return count(root, 0);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);
        System.out.println(countNodes(root));
    }
}
