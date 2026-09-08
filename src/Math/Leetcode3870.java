package Math;

public class Leetcode3870 {
    public static int countCommas(int n) {
        if (n <= 999)
            return 0;
        return n - 1000 + 1;
    }

    static void main() {
        System.out.println(countCommas(1003));
    }
}
