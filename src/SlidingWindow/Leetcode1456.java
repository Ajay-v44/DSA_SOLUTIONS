package SlidingWindow;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcode1456 {
    public static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static int maxVowels(String s, int k) {

        int maxCount = 0;
        int j;
        for (j = 0; j < k; j++) {
            if (vowels.contains(s.charAt(j)))
                maxCount++;
        }
        int i = 0;
        int count = maxCount;
        for (j = j; j < s.length(); j++) {
            if (vowels.contains(s.charAt(i)) && count >= 0) {
                count--;
            }
            if (vowels.contains(s.charAt(j))) {
                count++;
            }
            maxCount = Math.max(count, maxCount);
            i++;
        }
        return maxCount;
    }

    static void main() {
        System.out.println(maxVowels("novowels", 1));
    }
}
