package Array;

public class Leetcode1582 {
    public static int numSpecial(int[][] mat) {

        int count = 0;
        int[] rowC = new int[mat.length];
        int[] colC = new int[mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    rowC[i]++;
                    colC[j]++;
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && (rowC[i] == 1 && colC[j] == 1)) {
                    count++;
                }
            }
        }


        return count;

    }

    static void main() {
        int[][] num = {{1, 0, 0}, {0, 0, 1}, {1, 0, 0}};
        System.out.println(numSpecial(num));
    }
}
