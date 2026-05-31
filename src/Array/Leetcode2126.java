package Array;

import java.util.Arrays;

public class Leetcode2126 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {

        long curMass=mass;
        Arrays.sort(asteroids);
        for (int asteroid : asteroids) {
            if (curMass >= asteroid)
                curMass += asteroid;
            else
                return false;
        }
        return true;

    }

    static void main() {

    }
}
