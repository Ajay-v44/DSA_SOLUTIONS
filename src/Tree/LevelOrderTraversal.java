package Tree;


import java.util.*;

public class LevelOrderTraversal {
    public static void levelOrder(Node root){
        if (root==null)
            return ;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node current=q.remove();
            if(current==null){
                if(q.isEmpty())
                    break;
                else {
                    System.out.println();
                    q.add(null);
                }
            }else {
                System.out.print(current.data);
                if (current.left!=null)
                    q.add(current.left);
                if(current.right!=null)
                    q.add(current.right);
            }
        }
    }

    public static List<List<Integer>> levelOrderLeetcode(Node root){
        List<List<Integer>> list=new ArrayList<>();
        if (root==null)
            return list;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> lst2=new ArrayList<>();
        while (!q.isEmpty()){
            Node current=q.remove();
            if(current==null){
                if(q.isEmpty())
                    break;
                else {
                    list.add(lst2);
                    lst2=new ArrayList<>();
                    q.add(null);
                }
            }else {
                lst2.add(current.data);
                if (current.left!=null)
                    q.add(current.left);
                if(current.right!=null)
                    q.add(current.right);
            }
        }
        list.add(lst2);
        return list;
    }
// OPT version
//
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> list = new ArrayList<>();
//        if (root == null) {
//            return list;
//        }
//
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//
//        while (!q.isEmpty()) {
//            int levelSize = q.size();
//            List<Integer> currentLevel = new ArrayList<>();
//
//            for (int i = 0; i < levelSize; i++) {
//                TreeNode currentNode = q.remove();
//                currentLevel.add(currentNode.val);
//
//                if (currentNode.left != null) {
//                    q.add(currentNode.left);
//                }
//                if (currentNode.right != null) {
//                    q.add(currentNode.right);
//                }
//            }
//
//            list.add(currentLevel);
//        }
//
//        return list;
//    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root =BinaryTree.buildBinaryTree(nodes);
        levelOrder(root);
        System.out.println();
        System.out.println(levelOrderLeetcode(root));
    }

}
