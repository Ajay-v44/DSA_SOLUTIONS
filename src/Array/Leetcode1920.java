package Array;

import java.util.Arrays;

public class Leetcode1920 {
    public static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i]=nums[nums[i]];
        }
        return arr;
    }

    static void main() {
        int[] nums={1,3,2,0,};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
