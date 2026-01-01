package Tree;

public class BinarySearchTree {
    public static Node insert(Node node, int data) {
        if (node == null) {
//            returning root node
            return new Node(data);
        }

        if (data < node.data) {
//            go to left
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        return node;
    }

    public static Node search(Node root, int data) {
        if (root == null)
            return null;
        //        find the node
        if (data < root.data)
            return search(root.left, data);
        else if (data > root.data)
            return search(root.right, data);
        else
            return root;
    }

    public static Node delete(Node root, int data) {
        if (root == null) {
            return null;
        }

        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        }
        else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    private static Node findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        int[] arr = {1, 5, 9, 8, 0, 3};
        for (int ele : arr)
            root = insert(root, ele);
        BinaryTree.inOrderTraversal(root);
        System.out.println();
        System.out.println(delete(root, 5).data);
        BinaryTree.inOrderTraversal(root);

    }
}
