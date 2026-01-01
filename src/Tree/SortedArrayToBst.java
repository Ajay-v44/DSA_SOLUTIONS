package Tree;

import java.util.Arrays;

public class SortedArrayToBst {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length==0)
            return null;
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));
        return root;
    }

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode root=sortedArrayToBST(nums);
        System.out.println(root.val);
    }
}
