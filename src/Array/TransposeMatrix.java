package Array;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = matrix[j][i];
            }

        }
        return transpose;
    }

    static void main() {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(Arrays.deepToString(transpose(matrix)));

    }
}
