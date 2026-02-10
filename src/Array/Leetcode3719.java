package Array;

import java.util.HashSet;

public class Leetcode3719 {
    public static int longestBalanced(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> even = new HashSet<>();
            HashSet<Integer> odd = new HashSet<>();

            for (int j = i; j < nums.length; j++) {

                if (nums[j] % 2 == 0)
                    even.add(nums[j]);
                else
                    odd.add(nums[j]);

                if (odd.size() == even.size())
                    max = Math.max(max, (j - i) + 1);


            }

        }
        return max;
    }

    static void main() {
        int[] nums = {1,2,3,2};
        System.out.println(longestBalanced(nums));
    }
}
