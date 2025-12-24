package Array;

import java.util.Arrays;

public class AppleDistribution {
    public static int minimumBoxes(int[] apple, int[] capacity) {
        if (apple.length == 0 || capacity.length == 0) {
            return 0;
        }
        int totalBoxes = 0;
        int totalSum = 0;
        for (int ap : apple) {
            totalSum += ap;
        }
        Arrays.sort(capacity);
        for (int i = 0, j = capacity.length-1; i < j; i++, j--) {
            int tmp = capacity[i]; capacity[i] = capacity[j]; capacity[j] = tmp;
        }

        for (int cp : capacity) {
            if (totalSum <= 0) break;
            totalBoxes++;
            totalSum -= cp;
        }
        return totalBoxes;

    }

    static void main() {
        int[] apple={1,3,2};
        int[] capacity={4,3,1,5,2};
        System.out.println(minimumBoxes(apple, capacity));

    }
}
