package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class MaximumUniqueSum {
    public static void main(String[] args) {
        int[] nums = {-20,20};
        System.out.println(findUniqueSum(nums));
    }

    static int findUniqueSum(int[] arr) {
        int sum = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        int left = 0, currSum = 0;
        for (int right = 0; right < arr.length; right++) {
            while (set.contains(arr[right])) {
                set.remove(arr[left]);
                currSum -= arr[left];
                left++;
            }
            set.add(arr[right]);
            currSum += arr[right];
            sum = Math.max(sum, currSum);
        }


        return sum;
    }
}
