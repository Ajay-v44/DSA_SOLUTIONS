package Array;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode131 {
    public int[] arrayRankTransform(int[] arr) {
        int len = arr.length;
        if (len == 1)
            return new int[]{1};
        int[] cp = arr.clone();
        Arrays.sort(cp);
        HashMap<Integer, Integer> position = new HashMap<>();

        int rank = 1;
        for (int num : cp) {
            if (!position.containsKey(num)) {
                position.put(num, rank);
                rank++;
            }
        }

        for (int i = 0; i < len; i++) {
            arr[i] = position.get(arr[i]);
        }
        return arr;
    }

    static void main() {
        int[] arr = {37};

        Leetcode131 obj = new Leetcode131();

        System.out.println(Arrays.toString(obj.arrayRankTransform(arr)));
    }
}
