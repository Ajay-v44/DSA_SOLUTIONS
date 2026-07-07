package Math;

import java.util.ArrayList;
import java.util.List;

public class Leetcode3754 {
    public static long sumAndMultiply(int n) {
        int sum = 0;
        int combinedValue = 0;
        int placeValue=1;
        while (n > 0) {
            int rem = n % 10;
            if(rem>0) {
                combinedValue = combinedValue + (rem * placeValue);
                placeValue *= 10;
            }
            sum+=rem;
            n /= 10;
        }

        return (long) combinedValue*sum;
    }

    static void main() {
        System.out.println(sumAndMultiply(10203004));
    }
}
