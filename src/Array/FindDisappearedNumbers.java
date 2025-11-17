package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        if(nums.length==0)
            return lst;
        Set<Integer> set=new HashSet<>();
        for (int num:nums)
            set.add(num);

        for (int i = 1; i <=nums.length ; i++) {
            if(!set.contains(i)){
                lst.add(i);
            }
        }
        return lst;
    }

    public static void main(String[] args) {
        int[] nums={1,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
