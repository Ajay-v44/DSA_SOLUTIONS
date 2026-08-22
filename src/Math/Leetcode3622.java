package Math;

public class Leetcode3622 {
    public static boolean checkDivisibility(int n) {
        int ps = 1;
        int ds = 0;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            ps *= rem;
            ds += rem;
            temp /= 10;
        }
        return n % (ps + ds) == 0;
    }

    static void main() {
        System.out.println(checkDivisibility(23));
    }
}
