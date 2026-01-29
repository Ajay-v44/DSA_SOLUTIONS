package Array;

public class Leetcode171 {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (char c : columnTitle.toCharArray()) {
            int val = c - 'A' + 1;
            result = result * 26 + val;
        }
        return result;
    }

    static void main() {
        System.out.println(titleToNumber("AJAY"));
    }
}
