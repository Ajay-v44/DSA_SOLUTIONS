package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leetcode438 {
    public List<Integer> findAnagrams(String s, String p) {

        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        List<Integer> index = new ArrayList<>();
        for (Character c : p.toCharArray())
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);

        int i = 0;
        int matched = 0;
        for (int j = 0; j < s.length(); j++) {
            char right = s.charAt(j);

            if (frequencyMap.containsKey(right)) {
                frequencyMap.put(right, frequencyMap.get(right) - 1);
                if (frequencyMap.get(right) >= 0)
                    matched++;
            }

            if ((j - i) + 1 > p.length()) {
                char left = s.charAt(i);
                if (frequencyMap.containsKey(left)) {
//                    removing an already existed element in window
                    if (frequencyMap.get(left) >= 0)
                        matched--;
                    frequencyMap.put(left, frequencyMap.get(left) + 1);

                }
                i++;
            }
            if (matched == p.length()) {
                index.add(i);
            }
        }

        return index;
    }

    static void main() {

    }
}
