package DynamicProgramming;

public class SubSetDifferenceCount {

    public static int countSubSetDifference(int[] arr, int difference) {
        int sum = 0;
        for (int num : arr) sum += num;
        return findSubsetSumCount(arr, difference + sum / 2);
    }

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

    static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};
        int diff = 1;
        System.out.println(countSubSetDifference(arr, diff));
    }
}
