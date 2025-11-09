package Tree;


import java.util.ArrayList;
import java.util.List;

public class LeetcodeTravesrals {
    static List<Integer> lst = new ArrayList<>();
    static int idx=-1;
    public static List<Integer> preOrderTraversal(Node root) {
        if (root == null)
            return lst;
        lst.add(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        return lst;
    }

    public static List<Integer> inOrderTraversal(Node root) {
        if (root == null)
            return lst;
        inOrderTraversal(root.left);
        lst.add(root.data);
        inOrderTraversal(root.right);
        return lst;
    }

    public static List<Integer> postOrderTraversal(Node root) {
        if (root == null)
            return lst;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        lst.add(root.data);
        return lst;
    }

    public static Node add(int[] data) {
       idx++;
       if(idx>=data.length||data[idx]==-1)
           return null;
       Node newNode=new Node(data[idx]);
       newNode.left=add(data);
       newNode.right=add(data);
       return newNode;
    }

    public static void main(String[] args) {
        int[] inp = {1, 2, 3, 4, 5, -1, 8, -1, -1, 6, 7, 9};
        Node root=add(inp);
        System.out.println(inOrderTraversal(root));
    }
}
