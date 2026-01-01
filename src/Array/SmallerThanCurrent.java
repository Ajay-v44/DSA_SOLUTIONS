package Array;

import java.util.Arrays;

public class SmallerThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        if(nums.length==0)
            return nums;
        int[] freq=new int[101];
        int[] prefix=new int[101];
        int[] result=new int[nums.length];
        for (int num:nums)
            freq[num]++;
        System.out.println(Arrays.toString(freq));
        prefix[0] = freq[0];
        for (int i = 1; i < 101; i++) {
            prefix[i] = prefix[i - 1] + freq[i];
        }
        System.out.println(Arrays.toString(prefix));
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix[nums[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr={8,5,5,3,9};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
}

