package Array;

import java.util.HashMap;

public class Leetcode3761 {
    public static int minMirrorPairDistance(int[] nums) {
        int len = nums.length;

        HashMap<Integer, Integer> mapRev = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            if (mapRev.containsKey(nums[i])) {
                ans = Math.min(ans, i - mapRev.get(nums[i]));
            }
            int rev = rev(nums[i]);
            mapRev.put(rev, i);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static int rev(int num) {
        int ans = 0;
        while (num > 0) {
            ans *= 10;
            ans += num % 10;
            num /= 10;
        }
        return ans;
    }

    static void main() {
        int[] nums={12,21,45,33,54};
        System.out.println(minMirrorPairDistance(nums));
    }
}
