package BitManipulation;

public class Leetcode696 {
    public static int countBinarySubstrings(String s) {
        int previous = 0;
        int current = 1;
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                current++;
            } else {
                result += Math.min(current, previous);
                previous = current;
                current = 1;
            }
        }
        result += Math.min(previous, current);
        return result;
    }

    static void main() {
        System.out.println(countBinarySubstrings("10101"));
    }
}
