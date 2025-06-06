package Sorting;
//        Count Inversions of an Array

public class InversionCount {
    public static void main(String[] args) {
        int[] arr={10, 10, 10};
        System.out.println(getInversionCountBF(arr));
    }
    static int getInversionCountBF(int[] arr){
//        Naive Approach
        int count=0;
        int n= arr.length;
        if(n>1){
            for(int i=0;i<n-1;i++){
                for (int j=i+1;j<n;j++){
                    if(arr[i]>arr[j]){
                        count+=1;
                    }
                }
            }
        }
        return count;
    }
}
