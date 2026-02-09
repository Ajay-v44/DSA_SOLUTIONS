package SlidingWindow;

import java.util.HashSet;

public class Leetcode3 {
    public static int lengthOfLongestSubstringV2(String s) {
        //Sliding window
        int i = 0;
        int j = 0;
        int windowSize = 0;
        HashSet<Character> hashSet = new HashSet<>();
        while (j < s.length()) {
            char current =s.charAt(j);
            while (hashSet.contains(current)){
              hashSet.remove(s.charAt(i));
              i++;
            }
            hashSet.add(s.charAt(j));
            windowSize=Math.max(windowSize,(j-i)+1);
            j++;
        }
        return windowSize;
    }

    public static int lengthOfLongestSubstringV1(String s) {
        int longest = 0;
        HashSet<Character> hashSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (hashSet.contains(c)) {
                longest = Math.max(longest, hashSet.size());
                hashSet.clear();
            }
            hashSet.add(c);
        }
        return Math.max(longest, hashSet.size());
    }

    static void main() {
        System.out.println(lengthOfLongestSubstringV2("pwwkew"));
    }
}
