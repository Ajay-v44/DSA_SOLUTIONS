package Math;

public class Leetcode3783 {
    public static int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        return rev;
    }

    static void main() {
        System.out.println(mirrorDistance(0));
    }
}
