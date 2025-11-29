package Tree;

public class BalancedBinaryTree {
    public static int check(TreeNode root) {
        if (root == null)
            return 0;
        int left = check(root.left);
        if (left == -1)
            return -1;
        int right = check(root.right);
        if (right == -1)
            return -1;
        if (Math.abs(left - right) > 1)
            return -1;
        System.out.println("left \t"+left);
        System.out.println("right \t"+right);
        return Math.max(left, right) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);
        System.out.println(isBalanced(root));
    }
}
