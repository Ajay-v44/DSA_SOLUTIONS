package PrefixOrSuffixSum;

public class Leetcode3737 {
    public int countMajoritySubarrays(int[] nums, int target) {
        int len = nums.length;
        int[] res = new int[len + 1];
        res[0] = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == target)
                res[i + 1] = res[i] + 1;
            else
                res[i + 1] = res[i] + (-1);
        }
        int count = 0;
        for (int i = 0; i < res.length; i++) {
            for (int j = i + 1; j < res.length; j++) {
                if (res[j] - res[i] > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    static void main() {

    }
}


