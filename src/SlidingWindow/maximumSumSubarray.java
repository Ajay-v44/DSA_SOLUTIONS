package SlidingWindow;

public class maximumSumSubarray {
    public static void main(String[] args) {
        int[] arr={5,4,3,1,7,8};
        int k=2;
        System.out.println(findMaximumSumSubArray(arr,k));
    }
    static int findMaximumSumSubArray(int[] arr,int k){
        int sum=0;
        int windowSum=0;
//        First Window SUm
        for (int i = 0; i < k; i++) {
            windowSum+=arr[i];
        }
        sum=windowSum;
        for (int i = k+1; i <arr.length ; i++) {
            windowSum+=arr[i];
            windowSum-=arr[k];
            sum=Math.max(sum,windowSum);
            k+=1;
        }
        return sum;
    }
}
