package BitManipulation;

import java.math.BigInteger;

public class Leetcode1404 {
    public static int numSteps(String s) {
        int num = Integer.parseInt(s, 2);
        int count = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num += 1;
            }
            count++;
        }
        return count;
    }

    public static int numStepsOPT(String s) {
        int steps = 0;
        int carry = 0;

        for (int i = s.length() - 1; i > 0; i--) {
//            convert to Integer (s.charAt(i) gives a string minus it with a string '0' it gives a number)
            int bit = (s.charAt(i) - '0') + carry;
            if (bit % 2 == 0) {
                steps += 1;
            } else {
                steps += 2;
                carry = 1;
            }
        }
        return steps + carry;
    }

    static void main() {
        System.out.println(numStepsOPT("1101"));
    }
}
