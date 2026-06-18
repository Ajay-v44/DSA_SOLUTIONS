package TwoPointer;

import java.util.ArrayList;
import java.util.List;

public class Leetcode125 {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty())
            return true;
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z')
                result.add(Character.toLowerCase(c));
            else if ((c >= 'a' && c <= 'z')||(c>='0'&&c<='9'))
                result.add(c);
        }

        int left = 0;
        int right = result.size() - 1;
        if (right == 0)
            return false;
        while (left < right) {
            if (!result.get(left).equals(result.get(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }

    static void main() {
        System.out.println(isPalindrome("0P"));

    }
}
