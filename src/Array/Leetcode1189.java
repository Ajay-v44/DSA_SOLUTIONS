package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Leetcode1189 {
    public HashSet<Character> balloon = new HashSet<>(Set.of('b', 'a', 'l', 'o', 'n'));

    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        int bCount = hashMap.getOrDefault('b', 0);
        int aCount = hashMap.getOrDefault('a', 0);

        int lCount = hashMap.getOrDefault('l', 0) / 2;
        int oCount = hashMap.getOrDefault('o', 0) / 2;

        int nCount = hashMap.getOrDefault('n', 0);

        int result = bCount;
        result = Math.min(result, aCount);
        result = Math.min(result, lCount);
        result = Math.min(result, oCount);
        result = Math.min(result, nCount);
        return result;

    }

    static void main() {

    }
}
