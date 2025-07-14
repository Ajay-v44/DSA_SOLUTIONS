package Searching;

public class rotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
        System.out.println(findIndex(arr, key));
    }

    static int findIndex(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] >= arr[start]) {
                if (key >= arr[start] && key < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (key >= arr[mid] && key <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
