package FrequencyCount;

public class Leetcode242 {
    public static boolean isAnagram(String s, String t) {
        int[] chars = new int[26];
        for (char c : s.toCharArray())
            chars[c - 'a'] += 1;
        for (char c : t.toCharArray())
            chars[c - 'a'] -= 1;
        for (int i = 0; i < 26; i++) {
            if (chars[i] !=0)
                return false;
        }
        return true;
    }

    static void main() {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
