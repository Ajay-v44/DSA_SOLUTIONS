package HasMap;

import java.util.HashMap;

public class LuckyNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(findLucky(arr));
    }
    static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int luckyInteger = -1;

        for (int key : map.keySet()) {
            if (map.get(key) == key) {
                luckyInteger = key;
            }
        }
        return luckyInteger;
    }
}
