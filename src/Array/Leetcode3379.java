package Array;

public class Leetcode3379 {
    public int[] constructTransformedArray(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
                result[i] = nums[((i +nums[i]) % length+length )% length];
        }
        return result;
    }

    static void main() {

    }
}
