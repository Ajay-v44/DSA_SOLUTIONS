package Array;

import java.util.Arrays;

public class Leetcode2161 {
    public static int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int idx = 0;
        for (int num : nums) {
            if (num < pivot)
                result[idx++] = num;
        }
        for (int num : nums) {
            if (num == pivot)
                result[idx++] = num;
        }

        for (int num : nums) {
            if (num > pivot)
                result[idx++] = num;
        }
        return result;
    }

    static void main() {
        int[] nums={9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(pivotArray(nums, 10)));
    }
}
