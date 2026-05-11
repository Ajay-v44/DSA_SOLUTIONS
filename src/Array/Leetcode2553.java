package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Leetcode2553 {
    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int num : nums) {
            ArrayList<Integer> temp = new ArrayList<>();
            while (num > 0) {
                temp.add(num % 10);
                num /= 10;
            }
            Collections.reverse(temp);
            lst.addAll(temp);
        }
        int[] ans = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            ans[i] = lst.get(i);
        }
        return ans;
    }

    static void main() {
        int[] arr = {13, 25, 83, 77};
        System.out.println(Arrays.toString(separateDigits(arr)));
    }
}
