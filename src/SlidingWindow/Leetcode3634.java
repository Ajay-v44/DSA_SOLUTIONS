package SlidingWindow;

import java.util.Arrays;

public class Leetcode3634 {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int left = 0;
        int maxLen = 1;

        for (int right = 0; right < n; right++) {
            while ((long) nums[right] > (long) nums[left] * k) {
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return n - maxLen;
    }

    static void main() {

    }
}
