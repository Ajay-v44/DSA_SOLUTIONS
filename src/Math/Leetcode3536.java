package Math;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Leetcode3536 {
    public static int maxProduct(int n) {
        int max1 = 0;
        int max2 = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem > max1) {
                max2 = max1;
                max1 = rem;
            } else if (rem>max2) {
                max2=rem;
            }
            n /= 10;
        }
        return max1 * max2;
    }

    static void main() {
        System.out.println(maxProduct(1234));
    }
}
