package Tree;

public class BinarySearchTree {
    public static Node insert(Node node,int data){
        if(node==null){
//            returning root node
            return new Node(data);
        }

        if (data<node.data){
//            go to left
            node.left=insert(node.left,data);
        }else {
            node.right=insert(node.right,data);
        }
        return node;
    }

    public static void main(String[] args) {
        Node root=null;
        int[] arr={1,5,9,8,0,3};
        for (int ele:arr)
            root=insert(root,ele);
        BinaryTree.inOrderTraversal(root);
    }
}
