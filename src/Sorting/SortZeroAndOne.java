package Sorting;

import java.util.Arrays;

public class SortZeroAndOne {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        System.out.println(Arrays.toString(sortInAscendingOrder(arr)));
    }

    static int[] sortInAscendingOrderBF(int[] arr) {
/*        Time Complexity - O(n^2)
Space Complexity-O(1)
        */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        return arr;
    }

    static int[] sortInAscendingOrder(int[] arr) {
//        Dutch Flag Algorithm
//        O(n) Time Complexity
//        O(1) Space Complexity
        int lo = 0, mid = 0;
        int hi = arr.length - 1;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                swap(arr,mid,lo);
                lo++;
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, hi);
                hi--;
            } else {
                mid++;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
