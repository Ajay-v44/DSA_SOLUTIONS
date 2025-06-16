package PrefixOrSuffixSum;

public class RangeSum {
    public  static int[] arr;
    public static void main(String[] args) {

    }
    static void prefixArray(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
        }
        arr=nums;
    }
    static int findSum(int left,int right){
        if (left==0)
                return right;
        return  arr[right]-arr[left-1];
    }
}
