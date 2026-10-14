package DynamicProgramming;

public class DpBottomUp {
//    iterative table-filling (bottom-up)
    public static int dp(int[] wt, int[] val, int W, int n) {
        int[][] matrics = new int[n + 1][W + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (wt[i - 1] <= j) {
                    matrics[i][j] = Math.max(val[i - 1] + matrics[i - 1][j - wt[i - 1]], matrics[i - 1][j]);
                } else {
                    matrics[i][j] = matrics[i - 1][j];
                }
            }

        }
        return matrics[n][W];
    }

    static void main() {
        int[] wt = {10, 20, 30};
        int[] val = {60, 100, 120};
        int W = 50;
        int n = wt.length;

        System.out.println(dp(wt, val, W, n));
    }
}
