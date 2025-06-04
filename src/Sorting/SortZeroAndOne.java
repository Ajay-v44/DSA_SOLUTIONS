package Sorting;

import java.util.Arrays;

public class SortZeroAndOne {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        System.out.println(Arrays.toString(sortInAscendingOrderBF(arr)));
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
        int left = 0;
        int right = 1;
        int length = arr.length - 1;
        if (length <= 0) {
            return arr;
        }
        while (length > 0) {
            if (arr[left] > arr[right]) {
                int swap = arr[left];
                arr[left++] = arr[right];
                arr[right++] = swap;
            } else {
                if (arr[left] == arr[right]) {

                }
            }
            length--;
        }

        return arr;
    }
}
