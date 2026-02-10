package SlidingWindow;

public class Leetcode643 {
    public static double findMaxAverage(int[] nums, int k) {
        double maxAvg;
        int sum = 0;
        int i;
        for (i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxAvg =  sum ;
        int l = 0;
        for (int j = i; j < nums.length; j++) {
            sum = sum - nums[l];
            sum += nums[j];
            l++;
            maxAvg = Math.max(maxAvg,  sum);
        }
        return (double)maxAvg/k;
    }
    static void main() {
        int[] nums={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));

    }
}
