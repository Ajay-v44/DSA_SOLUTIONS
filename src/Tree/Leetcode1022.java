package Tree;

public class Leetcode1022 {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int current) {
        if (node == null) return 0;

        // Shift left and add current node value
        current = (current << 1) | node.val;

        // If leaf node → return the number formed
        if (node.left == null && node.right == null) {
            return current;
        }

        // Return sum of left + right subtree
        return dfs(node.left, current) + dfs(node.right, current);
    }
    static void main() {

    }
}
