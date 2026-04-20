package Array;

public class Leetcode2078 {
    public int maxDistance(int[] colors) {
        int maxDistance = 0;

        for (int i = 0; i < colors.length; i++) {
            for (int j = i; j < colors.length; j++) {
                if (colors[i] != colors[j]) {
                    maxDistance = Math.max(maxDistance, Math.abs(i - j));
                }

            }

        }
        return maxDistance;
    }

    public int maxDistanceOPT(int[] colors) {
        int n = colors.length;
        int maxDistance = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (colors[i] != colors[0]) {
                maxDistance = Math.max(maxDistance, i);
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (colors[i] != colors[n - 1]) {
                maxDistance = Math.max(maxDistance, n - 1 - i);
            }
        }

        return maxDistance;
    }

    static void main() {
        Leetcode2078 obj = new Leetcode2078();
        int[] colors = {1, 1, 1, 6, 1, 1, 1};
        System.out.println(obj.maxDistance(colors));
    }
}
