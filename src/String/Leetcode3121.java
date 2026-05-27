package String;

import java.util.Arrays;

public class Leetcode3121 {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        int[] lastLower = new int[26];
        int[] firstUpper = new int[26];
        boolean[] disqualified = new boolean[26];

        Arrays.fill(lastLower, -1);
        Arrays.fill(firstUpper, -1);

        for (int i = 0; i < 26; i++) {
            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {
                int idx = ch - 'a';
                lastLower[idx] = i;
                if (firstUpper[idx] != -1)
                    disqualified[idx] = true;
            } else {
                int idx = ch - 'A';
                if (firstUpper[idx] == -1)
                    firstUpper[idx] = i;
            }
        }

        for (int i = 0; i < 26; i++) {

            if (lastLower[i] != -1 && firstUpper[i] != -1 && !disqualified[i]) {
                if (lastLower[i] < firstUpper[i]) {
                    count++;
                }
            }

        }

        return count;
    }

    static void main() {

    }
}
