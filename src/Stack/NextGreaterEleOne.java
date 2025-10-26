package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterEleOne {
    public static int[] findNextGreatests(int[] arr) {
        int[] lst = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.empty()) {
                lst[i] = -1;
            } else {
                lst[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return lst;
    }

    public static void main(String[] args) {
        int[] arr={6,8,0,1,3};
//        -1,-1,7,5,1
        System.out.println(Arrays.toString(findNextGreatests(arr)));
    }
}
