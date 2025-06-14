package TwoPointer;

import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
    int[] arr={2,0,1,3};
    moveZerosAction(arr);
    }
    static void moveZerosAction(int[] nums){
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
