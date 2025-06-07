package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlapInterval {
    public static void main(String[] args) {
        int[][] arr = {{7, 8}, {1, 5}, {2, 4}, {4, 6}};
        List<int[]> res = getOverLapInterval(arr);

        for (int[] interval : res) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }

    static List<int[]> getOverLapInterval(int[][] arr) {
        List<int[]> res = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            if (!res.isEmpty() && res.get(res.size() - 1)[1] >= end) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                }
            }
            res.add(new int[]{start, end});
        }

        return res;
    }
}
