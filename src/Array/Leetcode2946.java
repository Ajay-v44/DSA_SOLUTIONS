package Array;

public class Leetcode2946 {

    public static boolean areSimilar(int[][] mat, int k) {
        for (int i = 0; i < mat.length; i++) {
            boolean isEven = i % 2 == 0;
            int n = mat[i].length;
            for (int j = 0; j < n; j++) {
                if (isEven) {
                    if (mat[i][j] != mat[i][(j + k) % n]) return false;
                } else {
                    int idx = ((j - k) % n + n) % n;
                    if (mat[i][j] != mat[i][idx]) return false;
                }
            }
        }
        return true;
    }

    static void main() {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.print(areSimilar(mat, 2));

    }
}
