package Array;

import java.util.HashSet;


public class Leetcode217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;

        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }

    static void main() {
        int[] nums = {1, 2, 3, 4, 5};
        Leetcode217 leetcode = new Leetcode217();
        System.out.println(leetcode.containsDuplicate(nums));
    }
}
