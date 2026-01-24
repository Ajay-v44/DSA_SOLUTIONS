package Array;

import java.util.Arrays;

public class Leetcode1877 {
    public static int minPairSum(int[] nums) {
        if (nums.length == 0) return 0;
        int maxPairSum = 0;
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            maxPairSum = Math.max(maxPairSum,nums[i] + nums[j]);
            i++;
            j--;
        }
        return maxPairSum;
    }

    static void main() {
        int[] nums = {3, 5, 4, 2, 4, 6};
        System.out.println(minPairSum(nums));
    }
}
