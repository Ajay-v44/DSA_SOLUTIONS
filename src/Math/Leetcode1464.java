package Math;

import java.util.Arrays;

public class Leetcode1464 {
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        return (nums[len-1] - 1) * (nums[len-2] - 1);
    }

    static void main() {
        int[] nums = {1, 12, 4, 6};
        System.out.println(maxProduct(nums));
    }
}
