package PrefixOrSuffixSum;

public class DivideSubArray {
    public static void main(String[] args) {
        /*
        find wether i can make a sub array with existing array only if both array sum can be same.
         */
        int[] arr ={2,4,6,2,1,5,8,2};
        System.out.println(canArrayBeDivided(arr));
    }
    static boolean canArrayBeDivided(int[] arr){
        int sum=0;
        int prefixSum=0;

        for(int i:arr)
            sum+=i;
        for(int i:arr){
            prefixSum+=i;
            if((sum-prefixSum)==prefixSum)
                return true;
        }
        return false;
    }
}
