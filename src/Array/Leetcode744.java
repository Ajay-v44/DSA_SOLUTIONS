package Array;

public class Leetcode744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters) {
            if (c > target)
                return c;
        }
        return letters[0];
    }

    static void main() {
        char[] letters = {'c', 'f', 'j' };
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }
}
