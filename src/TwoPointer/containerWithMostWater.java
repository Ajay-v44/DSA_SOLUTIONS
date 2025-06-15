package TwoPointer;

public class containerWithMostWater {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(getAreaOfContainer(arr));
    }
    static int getAreaOfContainer(int[] arr){
        int maxArea=0;
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int width=right-left;
            int minHeight=Math.min(arr[left],arr[right]);
            int area=minHeight*width;
            maxArea=Math.max(maxArea,area);
            if(arr[left]<arr[right])
                left++;
            else
                right--;
        }
        return maxArea;

    }
}
