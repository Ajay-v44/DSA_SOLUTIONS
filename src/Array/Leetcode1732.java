package Array;

public class Leetcode1732 {
    public static int largestAltitude(int[] gain) {
        if (gain.length == 1)
            return gain[0];
        int max = 0;
        int result = 0;
        for (int i = 0; i < gain.length - 1; i++) {
            result = result + gain[i];
            max = Math.max(result, max);
        }
        return max;
    }

    static void main() {
        int[] arr = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(arr));
    }
}
