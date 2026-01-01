package Searching;

public class BinarySearch {
    static int findElement(int[] arr,int target){
        int mid;
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target) {
                return mid;
            }else if (arr[mid]<target) {
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,12,15,22,30};
        int target=15;
        final int result=findElement(arr,target);
        if(result==-1)
            System.out.println("Element Not Found");
        else
            System.out.println("Element "+target+" Found at "+result+" Index.");
    }
}
