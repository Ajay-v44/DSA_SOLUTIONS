package Array;

import java.util.Arrays;

public class Leetcode2144 {
    public static int minimumCost(int[] cost) {

        int totalCost = 0;
        Arrays.sort(cost);
        int i = cost.length - 1;
        int count = 0;
        while (i >= 0) {
            if (count == 2) {
                count = 0;
            }else {
                totalCost += cost[i];
                count++;
            }
            i--;
        }
        return totalCost;
    }

    static void main() {
        int[] cost={6,5,7,9,2,2};
        System.out.println(minimumCost(cost));
    }
}
