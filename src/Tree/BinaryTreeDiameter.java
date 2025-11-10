package Tree;

import static Tree.BinaryTree.buildBinaryTree;

public class BinaryTreeDiameter {
    public static class TreeInfo{
        int height;
        int diam;

        public TreeInfo(int height, int diam) {
            this.height = height;
            this.diam = diam;
        }
    }

    public static TreeInfo findDiameter(Node root){

        if (root==null)
            return new TreeInfo(0,0);

        TreeInfo left=findDiameter(root.left);
        TreeInfo right=findDiameter(root.right);

        int myHeight=Math.max(left.height, right.height)+1;

        int diamL= left.diam;
        int diamR= right.diam;
        int diamWR=left.height+right.height;

        int myDiam=Math.max(Math.max(diamL,diamR),diamWR);
        return new TreeInfo(myHeight,myDiam);
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildBinaryTree(nodes);
        System.out.println(findDiameter(root).diam);

    }
}
