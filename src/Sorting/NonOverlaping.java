package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlaping {
    public static void main(String[] args) {
        int[][] arr={{1, 3}, {1, 3}, {1, 3}};
        System.out.println(minRemoval(arr));
    }
    static int minRemoval(int[][] intervals) {
        int cnt=0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] < end){
                cnt++;
            }else{
                end=intervals[i][1];
            }
        }
        return cnt;
    }
}
