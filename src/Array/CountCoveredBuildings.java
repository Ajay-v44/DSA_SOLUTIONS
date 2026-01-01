package Array;

public class CountCoveredBuildings {
    public static int countCoveredBuildings(int n, int[][] buildings) {
        int count = 0;
        int length = buildings.length;
        for (int i = 0; i < length; i++) {
            int xi = buildings[i][0];
            int yi = buildings[i][1];
            boolean hasLeft = false;
            boolean hasRight = false;
            boolean hasUp = false;
            boolean hasDown = false;
            for (int j = 0; j < length; j++) {
                if (i == j) continue;
                int xj = buildings[j][0];
                int yj = buildings[j][1];
                if (xj == xi) {
                    if (yj < yi) hasLeft = true;
                    if (yj > yi) hasRight = true;
                }
                if (yj == yi) {
                    if (xj < xi) hasUp = true;
                    if (xj > xi) hasDown = true;
                }
                if (hasLeft && hasRight && hasUp && hasDown) break;
            }
            if (hasLeft && hasRight && hasUp && hasDown) count++;
        }
        return count;
    }

    static void main() {
        int n = 3;
        int[][] buildings = {{1, 2}, {2, 2}, {3, 2}, {2, 1}, {2, 3}};
        System.out.println(countCoveredBuildings(n, buildings));
    }
}
