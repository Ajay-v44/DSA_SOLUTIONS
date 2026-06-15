package SlidingWindow;

public class FixedWindow {
    static void main() {
        int[] nums={1,2,3,4,5,1};
        int k=2;
        int i=0;
        int j ;
        int maxSum=0;
        int currWindow=0;
        for(j=0; j < k; j++) {
            currWindow+=nums[j];
        }
        maxSum=currWindow;
        while (j<nums.length){
            currWindow=currWindow-nums[i]+nums[j];
            maxSum=Math.max(maxSum,currWindow);
            j++;
            i++;
        }
        System.out.println(maxSum);
    }
}
