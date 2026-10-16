package DynamicProgramming;

public class CountSubSet {
    public static int findSubsetSumCount(int[] arr, int sum) {
        int n = arr.length;
        int[][] matrix = new int[n + 1][sum + 1];
        matrix[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    matrix[i][j] = matrix[i - 1][j - arr[i - 1]] + matrix[i - 1][j];
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
        System.out.println(findSubsetSumCount(list, sum));
    }
}
