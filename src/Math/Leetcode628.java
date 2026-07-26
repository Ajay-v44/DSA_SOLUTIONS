package Math;

import java.util.Arrays;

public class Leetcode628 {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int option1 = nums[len - 1] * nums[len - 2] * nums[len - 3];
        int option2 = nums[0] * nums[1] * nums[2];
        return Math.max(option1, option2);
    }

    static void main() {
        int[] nums = {1, 2, 3, 4};
        System.out.println(maximumProduct(nums));

    }
}
