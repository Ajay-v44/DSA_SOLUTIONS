package Sorting;

import java.util.Arrays;

public class Leetcode1833 {
    public static int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);
        int sum = 0;
        int count = 0;
        if (costs[0] > coins)
            return 0;
        for (int cost : costs) {
            if (sum + cost > coins)
                break;
            count++;
            sum += cost;
        }
        return count;
    }

    static void main() {

    }
}
