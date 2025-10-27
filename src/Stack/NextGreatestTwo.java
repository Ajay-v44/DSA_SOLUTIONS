package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreatestTwo {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] lst = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() < nums2[i]) {
                stack.pop();
            }
            if (stack.empty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], stack.peek());
            }
            stack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            lst[i] = map.get(nums1[i]);
        }
        return lst;
    }

    public static void main(String[] args) {
        int[] num1={4,1,2};
        int[] num2={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(num1, num2)));
    }
}
