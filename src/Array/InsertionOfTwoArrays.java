package Array;

import java.util.Arrays;
import java.util.HashSet;

public class InsertionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
        for(int ele:nums1)
            set.add(ele);
        for (int ele:nums2){
            if(set.contains(ele))
                result.add(ele);
        }
        return result.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int[] num1={1,2,3};
        int[] num2={2,3,4};

        System.out.println(Arrays.toString(intersection(num1, num2)));
    }
}
