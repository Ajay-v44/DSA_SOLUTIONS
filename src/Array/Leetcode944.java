package Array;

public class Leetcode944 {
    public static int minDeletionSize(String[] strs) {
        int deleteColumns = 0;
        int rows = strs.length;
        int cols = strs[0].length();

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows - 1; i++) {
                if (strs[i].charAt(j) > strs[i + 1].charAt(j)) {
                    deleteColumns++;
                    break; // move to next column
                }
            }
        }

        return deleteColumns;
    }

    static void main() {
        String[] strs = {"cba", "daf", "ghi"};
        System.out.println(minDeletionSize(strs));
    }
}
