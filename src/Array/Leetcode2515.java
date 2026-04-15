package Array;

import java.util.Objects;

public class Leetcode2515 {
    public static int closestTarget(String[] words, String target, int startIndex) {
        int minStep = Integer.MAX_VALUE;
        int n = words.length;
        for (int i = 0; i < n; i++) {

            if (words[i].equals(target)) {
                int forwardStep = (i - startIndex + n) % n;
                int backwardStep = (startIndex - i + n) % n;
                minStep = Math.min(minStep, Math.min(forwardStep, backwardStep));
            }

        }
        return minStep==Integer.MAX_VALUE?-1:minStep;
    }

    static void main() {
        String[] words = {"hello", "i", "am", "leetcode", "hello"};
        String target = "hello";
        int startIndex = 1;
        System.out.println(closestTarget(words,target,startIndex));
    }
}
