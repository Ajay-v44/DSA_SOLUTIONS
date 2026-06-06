package Array;

import java.util.Arrays;

public class Leetcode2574 {
    public static int[] leftRightDifference(int[] nums) {
        if (nums.length <= 1)
            return new int[]{0};
        int[] result = new int[nums.length];

        int rightSum = 0;
        for (int num : nums)
            rightSum += num;
        int leftSum = 0;
        rightSum = rightSum - nums[0];
        result[0] = Math.abs(leftSum - rightSum);
        for (int i = 1; i < nums.length ; i++) {
            rightSum = rightSum - nums[i];
            leftSum += nums[i - 1];
            result[i] = Math.abs(leftSum - rightSum);
        }
        return result;
    }

    static void main() {
        int[] nums={10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
}
