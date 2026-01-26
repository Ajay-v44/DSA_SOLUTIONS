package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1200 {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(arr);
        int minAbsolute = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff=arr[i+1]-arr[i];
            if(diff<minAbsolute){
                minAbsolute=diff;
                lst.clear();
                lst.add(Arrays.asList(arr[i],arr[i+1]));
            } else if (diff==minAbsolute) {
                lst.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return lst;
    }

    static void main() {
        int[] arr={10,6,1,3,15};
        System.out.println(minimumAbsDifference(arr));

    }
}
