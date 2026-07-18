package Math;

import java.util.Arrays;

public class Leetcode1979 {

    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min, div;
        min = div = nums[0];
        int max = nums[nums.length-1];
        while (div > 0) {
            if ((min % div == 0) && (max % div == 0))
                return div;
            div--;
        }
        return 0;
    }

    static void main() {
        int[] nums={7,5,6,8,3};
        System.out.println(findGCD(nums));
    }
}
