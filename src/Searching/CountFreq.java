package Searching;

public class CountFreq {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,5};
        System.out.println(findFreq(arr,3));
    }

    static int findFreq(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if(num==target)
                count+=1;
            if(num>target)
                break;
        }
        return count;
    }
}
