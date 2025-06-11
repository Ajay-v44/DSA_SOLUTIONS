package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumPositiveSubArray {
    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>(Arrays.asList(3, -2, 1, 4));
        int l=2;
        int s=3;
        System.out.println(sumOfMPSA(lst,l,s));

    }
    static int sumOfMPSA(List<Integer> nums,int l,int s){
        int sum=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        for (int i = 0; i < nums.size(); i++) {

        }
        return sum;
    }
}
