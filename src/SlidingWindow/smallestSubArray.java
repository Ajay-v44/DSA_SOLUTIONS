package SlidingWindow;

public class smallestSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int S = 7;
        System.out.println(findSmallestSubArrayCount(arr, S));
    }

    static int findSmallestSubArrayCount(int[] arr, int S) {
      int minLength=Integer.MAX_VALUE;
      int windowStart=0;
      int windowSum=0;
      for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
          windowSum+=arr[windowEnd];
          while (windowSum>=S){
              minLength=Math.min(minLength,windowEnd-windowStart+1);
              windowSum-=arr[windowStart];
              windowStart++;
          }
      }
      return minLength==Integer.MAX_VALUE?0:minLength;
    }
}
