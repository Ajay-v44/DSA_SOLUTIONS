package Sorting;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] arr = {1, -2147483648, 2};
        System.out.println(findThirdLargestElement(arr));
    }

    static int findThirdLargestElement(int[] arr) {
        Integer first = null;
        Integer second = null;
        Integer third = null;
        for (Integer number : arr) {
            if (number.equals(first) || number.equals(second) || number.equals(third)) continue;
            if (first == null || number > first) {
                third = second;
                second = first;
                first = number;
            } else if (second == null || number > second) {
                third = second;
                second = number;

            } else if (third == null || number >= third) {
                third = number;
            }
        }
        return third == null ? first : third;
    }
}
