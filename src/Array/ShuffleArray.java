package Array;

import java.util.Arrays;

public class ShuffleArray {
    private static final int[] EMPTY_INT_ARRAY = new int[0];

    public static int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        if (len == 0)
            return EMPTY_INT_ARRAY;
        int[] result = new int[len];
        int i=0;
        int j=-1;
        while (i < len / 2) {
            result[++j] = nums[i];
            result[++j]=nums[i+n];
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }
}
