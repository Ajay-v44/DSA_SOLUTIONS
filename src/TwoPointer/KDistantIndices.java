package TwoPointer;

import java.util.ArrayList;
import java.util.List;

public class KDistantIndices {
    public static void main(String[] args) {
        int[] arr = {3, 4, 9, 1, 3, 9, 5};
        int key = 9;
        int k = 1;
        System.out.println(getKIndices(arr,key,k));
    }

    static List<Integer> getKIndices(int[] nums, int key, int k) {
        List<Integer> lst = new ArrayList<>();
        List<Integer> idx = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key)
                idx.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int id : idx) {
                if (Math.abs(i - id) <= k) {
                    lst.add(i);
                    break;
                }
            }
        }

        return lst;
        
    }
}
