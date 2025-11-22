package Math;

public class Leetcode3190 {
    public static int minimumOperations(int[] nums) {
        if(nums.length==0)
            return 0;
        int noOfOperations=0;
        for(int num:nums){
            if(num%3!=0){
                if((num+1)%3==0||(num-1)%3==0)
                    noOfOperations++;
            }
        }
        return noOfOperations;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(minimumOperations(nums));
    }
}
