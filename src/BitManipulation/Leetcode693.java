package BitManipulation;

public class Leetcode693 {
    public static boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        int i = 0;
        while (i < binary.length() - 1) {
            if (binary.charAt(i) == binary.charAt(i + 1))
                return false;
            i++;
        }
        return true;
    }

    //    bitwise Operator
    public static boolean hasAlternatingBitsV2(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            // get last bit
            binary.append(n & 1);
            // Right shift (divide by 2)
            n = n >> 1;
        }
        binary.reverse();
        int i = 0;
        while (i < binary.length() - 1) {
            if (binary.charAt(i) == binary.charAt(i + 1))
                return false;
            i++;
        }
        return true;
    }

    static void main() {
        System.out.println(hasAlternatingBitsV2(5));
    }
}
