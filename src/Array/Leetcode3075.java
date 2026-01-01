package Array;

import java.util.Arrays;

public class Leetcode3075 {
    public static long maximumHappinessSum(int[] happiness, int k) {
        if (k == 0 || happiness.length == 0) return 0;
        Arrays.sort(happiness);
        for (int i = 0, j = happiness.length - 1; i < j; i++, j--) {
            int tmp = happiness[i];
            happiness[i] = happiness[j];
            happiness[j] = tmp;
        }
        long maxSum = 0;
        for (int i = 0; i <= k - 1; i++) {
            if(happiness[i] - i > 0) maxSum += happiness[i] - i;
        }
        return maxSum;
    }
    public static long maximumHappinessSumOPT(int[] happiness, int k) {
        if (k == 0 || happiness.length == 0) return 0;
        Arrays.sort(happiness);
        int penality=0;
        long maxSum = 0;
        for (int i =happiness.length-1 ; i >= 0 && penality<k; i--) {

            int val=happiness[i] - penality;

            if( val<=0) break;

            maxSum += val;
            penality++;
        }
        return maxSum;
    }

    static void main() {
        int[] happiness = {1,1,1,1};
        int k = 2;
        System.out.println(maximumHappinessSumOPT(happiness, k));
    }
}
