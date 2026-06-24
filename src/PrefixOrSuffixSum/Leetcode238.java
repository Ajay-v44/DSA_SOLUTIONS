package PrefixOrSuffixSum;

import java.util.Arrays;

public class Leetcode238 {
    public static int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] res = new int[len];
        int prefix = 1;
        for (int i = 0; i < len; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for (int j = len-1; j >= 0; j--) {
            res[j] *= suffix;
            suffix *= nums[j];
        }
        return  res;
    }

    static void main() {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
