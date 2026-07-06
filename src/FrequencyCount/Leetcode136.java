package FrequencyCount;

import java.util.HashMap;

public class Leetcode136 {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        for (int num : nums) {
            if (map.get(num) == 1)
                return num;
        }
        return 0;
    }

    static void main() {
        int[] num = {2, 2, 1};
        System.out.println(singleNumber(num));
    }
}
