package Array;

public class Leetcode1288 {
    public int removeCoveredIntervals(int[][] intervals) {
        int count = intervals.length;
        if(count<3){
            if (intervals[1][0] <= intervals[0][0] && intervals[0][1] <= intervals[1][1]) {
                count--;
            }
        }
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i + 1][0] <= intervals[i][0] && intervals[i][1] <= intervals[i + 1][1]) {
                count--;
            }

        }
        return count;
    }

    static void main() {

    }
}
