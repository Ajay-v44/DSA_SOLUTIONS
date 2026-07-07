package FrequencyCount;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Leetcode1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);
        for (int count: map.values()) {
            if (!set.add(count))
                return false;
        }
        return true;
    }

    static void main() {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));
    }
}
