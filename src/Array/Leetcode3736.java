package Array;

public class Leetcode3736 {
    public static int minMoves(int[] nums) {
        int maxNum = nums[0];
        int minMoves = 0;
        for (int num : nums)
            maxNum = Math.max(maxNum, num);

        for (int num : nums)
            minMoves += (maxNum - num);

        return minMoves;
    }

    static void main() {
        System.out.println(minMoves(new int[]{1,2,3}));
    }
}
