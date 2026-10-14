package DynamicProgramming;

import java.util.Arrays;

public class EqualSumPartitioning {
    public static boolean equalSumPartitionProblem(int[] arr, int sum) {
        int arraySum = Arrays.stream(arr).sum();

        if (arraySum % 2 != 0)
            return false;
        return findSubSetSum(arr, sum / 2);

    }

    public static Boolean findSubSetSum(int[] list, int sum) {
        int n = list.length;
        boolean[][] matrix = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            matrix[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (list[i - 1] <= j) {
                    matrix[i][j] = matrix[i][j - list[i - 1]] || matrix[i - 1][j];

                } else {
                    matrix[i][j] = matrix[i - 1][j];
                }
            }

        }
        return matrix[n][sum];
    }

    static void main() {
        int[] list = {2, 3, 7, 8, 10};
        int sum = 11;
        System.out.println(equalSumPartitionProblem(list, sum));
    }
}
