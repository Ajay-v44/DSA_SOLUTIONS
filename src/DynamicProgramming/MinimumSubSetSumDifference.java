package DynamicProgramming;

public class MinimumSubSetSumDifference {
    public static int minDifferenceOptimized(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;

        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : arr) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        for (int j = target; j >= 0; j--) {
            if (dp[j]) {
                return sum - 2 * j;
            }
        }
        return sum;
    }

    static void main() {
        int[] list = {2, 3, 7, 8, 10};
        System.out.println(minDifferenceOptimized(list));
    }

}
