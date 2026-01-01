package Array;

import java.util.Arrays;

public class Concatination {
    private static final int[] EMPTY_INT_ARRAY = new int[0];

    public static int[] getConcatenation(int[] nums) {
        if (nums.length==0)
            return EMPTY_INT_ARRAY;
        int len=nums.length;
        int[] newNum=new int[len*2];

        for (int i = 0; i < len; i++) {
            newNum[i]=nums[i];
            newNum[i+len]=nums[i];
        }
        return newNum;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
