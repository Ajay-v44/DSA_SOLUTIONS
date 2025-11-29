package Math;

public class MinOperations {
    public static int minOperations(int[] nums, int k) {
        int sum=0;
        for(int num:nums) sum+=num;
        return sum%k;
    }

    static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(minOperations(arr,3));
    }
}
