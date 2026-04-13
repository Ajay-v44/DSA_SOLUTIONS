package Array;

public class Leetcode1848 {
    public static int getMinDistance(int[] nums, int target, int start) {
        int min =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                min=Math.min(min,Math.abs(i-start));
            }
        }
        return min;
    }
    static void main() {
        int[] nums={1,2,3,4,5};
        int target=5;
        int start=3;
        System.out.println(getMinDistance(nums,target,start));
    }
}
