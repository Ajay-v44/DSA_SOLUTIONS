package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class Leetcode567 {


    public static boolean checkInclusionV2(String s1, String s2) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (Character c : s1.toCharArray())
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);

        int remainingCharacters = s1.length();
        int i = 0;
        for (int j = 0; j < s2.length(); j++) {
            char right = s2.charAt(j);
            if (frequencyMap.containsKey(right)) {
                if (frequencyMap.get(right) > 0) {
                    remainingCharacters--;
                }
                frequencyMap.put(right, frequencyMap.get(right) - 1);
            }

            if (j - i + 1 > s1.length()) {
                char left = s2.charAt(i);

                if (frequencyMap.containsKey(left)) {
                    frequencyMap.put(left, frequencyMap.get(left) + 1);
                    if (frequencyMap.get(left) > 0) {
                        remainingCharacters++;
                    }
                }

                i++;
            }

            if (remainingCharacters == 0) {
                return true;
            }
        }
        return false;
    }


    public static boolean checkInclusion(String s1, String s2) {
        int len = s1.length();

        HashSet<Character> hashSet = new HashSet<>();
        for (char c : s1.toCharArray())
            hashSet.add(c);

        for (int i = 0; i < s2.length(); i++) {
            if (hashSet.contains(s2.charAt(i))) {
                int j = i;
                while ((j - i) + 1 < len) {
                    j++;
                    if (!hashSet.contains(s2.charAt(j))) {
                        i = j;
                        break;
                    }
                }
                if ((j - i) + 1 == len)
                    return true;
            }

        }
        return false;

    }

    static void main() {
        System.out.println(checkInclusion("ab", "eidboaoo"));

    }
}
