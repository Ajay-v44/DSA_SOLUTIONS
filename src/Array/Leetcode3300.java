package Array;

public class Leetcode3300 {
    public static int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int j : nums) {
            int num = j;
            int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }
            min = Math.min(sum, min);
        }
        return min;
    }

    static void main() {
        int[] nums={10,12,13,14};
        System.out.println(minElement(nums));
    }
}
