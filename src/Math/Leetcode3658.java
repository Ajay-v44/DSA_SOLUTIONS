package Math;

public class Leetcode3658 {
    public static int gcdOfOddEvenSums(int n) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i <= n*2; i++) {
            if (i % 2 == 0)
                evenSum += i;
            else
                oddSum += i;
        }
        int result = Math.min(oddSum, evenSum);

        while (result > 0) {
            if (oddSum % result == 0 && evenSum % result == 0)
                break;
            result--;
        }
        return result;
    }

    static void main() {
        System.out.println(gcdOfOddEvenSums(4));
    }
}
