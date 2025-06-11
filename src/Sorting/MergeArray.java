package Sorting;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] a={2, 4, 7, 10};
        int[] b={2, 3};
        mergeArrayWithoutExtraSpace(a,b);
    }
    static void mergeArrayWithoutExtraSpace(int[]a ,int[]b){
        int i=0;
        int j=0;
        while(j<b.length-1){
            if(a[i]>b[j]){
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                j++;
//                i--;
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
