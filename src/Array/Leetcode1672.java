package Array;

public class Leetcode1672 {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] row : accounts) {
            int sum = 0;
            for (int money : row) {
                sum += money;
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }

    static void main() {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(arr));
    }
}
