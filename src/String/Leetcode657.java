package String;

public class Leetcode657 {
    public static boolean judgeCircle(String moves) {
        int i = 0;
        int j = 0;
        for (int k = 0; k < moves.length(); k++) {
            if (moves.charAt(k) == 'L') {
                j += 1;
            } else if (moves.charAt(k) == 'R') {
                j -= 1;
            } else if (moves.charAt(k) == 'U') {
                i += 1;
            } else {
                i -= 1;
            }
        }
        return i == 0 && j == 0;
    }

    static void main() {
        System.out.println(judgeCircle("UD"));
    }
}
