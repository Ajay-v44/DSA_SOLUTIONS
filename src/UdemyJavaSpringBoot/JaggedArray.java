package UdemyJavaSpringBoot;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][];
        arr[0] = new int[2];
        arr[1] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
