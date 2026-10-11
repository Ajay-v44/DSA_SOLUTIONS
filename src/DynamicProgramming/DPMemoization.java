package DynamicProgramming;

import java.util.Arrays;

public class DPMemoization {

    int[][] matrix = new int[1000][5000];

    public int knapSackProblem(int[] wt, int[] val, int W, int n) {
        for (int[] row : matrix) {
            Arrays.fill(row, -1);
        }
        return dp(wt, val, W, n);
    }

    private int dp(int[] wt, int[] val, int W, int n) {
        if (n < 0 || W <= 0) {
            return 0;
        }

        if (matrix[n][W] != -1) {
            return matrix[n][W];
        }

        if (wt[n] > W) {
            matrix[n][W] = dp(wt, val, W, n - 1);
            return matrix[n][W];
        } else {
            matrix[n][W] = Math.max(
                    val[n] + dp(wt, val, W - wt[n], n - 1),
                    dp(wt, val, W, n - 1)
            );
            return matrix[n][W];
        }
    }

    static void main() {
        DPMemoization obj = new DPMemoization();
        int[] wt = {10, 20, 30};
        int[] val = {60, 100, 120};
        int W = 50;
        int n = wt.length - 1;

        System.out.println(obj.knapSackProblem(wt, val, W, n));
    }
}