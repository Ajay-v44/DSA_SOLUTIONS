package Array;

import java.util.Hashtable;

public class Leetcode2784 {
    public static boolean isGood(int[] nums) {
        Hashtable<Integer, Integer> items = new Hashtable<>();
        int max = nums[0];
        for (int num : nums) {
            items.put(num, items.getOrDefault(num, 0) + 1);
            max = Math.max(max, num);
        }
        for(int i=1;i<max;i++){
            if(!items.containsKey(i)) return false;
        }
        return nums.length == max + 1 && items.get(max) == 2;
    }

    static void main() {
        int[] nums = {1, 3, 4, 4, 2};
        System.out.println(isGood(nums));
    }
}
