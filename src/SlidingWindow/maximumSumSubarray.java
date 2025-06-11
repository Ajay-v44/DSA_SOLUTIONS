package SlidingWindow;

public class maximumSumSubarray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 7, 8};
        int k = 2;
        System.out.println(findMaximumSumSubArray(arr, k));
    }

    static int findMaximumSumSubArray(int[] arr, int k) {
        int sum = 0;
        int windowSum = 0;
//        First Window SUm
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        sum = windowSum;
//        Sliding Window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];
            sum = Math.max(sum, windowSum);
        }
        return sum;
    }
}
