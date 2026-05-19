package Array;

public class Leetcode2540 {
    public static int getCommon(int[] nums1, int[] nums2) {
        int minNum = -1;
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                minNum = nums1[i];
                break;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            }
        }
        return minNum;
    }

    static void main() {
        int[] num1 = {4, 6};
        int[] num2 = {5, 6};
        System.out.println(getCommon(num1, num2));
    }
}
