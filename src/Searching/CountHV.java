package Searching;

public class CountHV {
    public static void main(String[] args) {
        int[] arr={2,4,1,1,6,5};
        System.out.println(countHillAndValley(arr));
    }

    static int countHillAndValley(int[] arr) {
        int count = 0;
        int i = 1;
        int left=0;
        while (i < arr.length - 1) {
            if (arr[i] != arr[i + 1]) {
                if ((arr[i] > arr[left] && arr[i] > arr[i + 1]) || (arr[i] < arr[left] && arr[i] < arr[i + 1])) {
                    count += 1;
                }
                left=i;
            }
            i += 1;
        }
        return count;
    }
}
