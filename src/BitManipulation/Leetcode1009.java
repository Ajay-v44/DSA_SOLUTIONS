package BitManipulation;

public class Leetcode1009 {
    public static int bitwiseComplement(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.append((n & 1) ^ 1);
            n >>= 1;
        }
        return Integer.parseInt(binary.reverse().toString(), 2);

    }

    static void main() {
        System.out.println(bitwiseComplement(5));
    }
}
