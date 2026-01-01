package Stack;

import java.util.ArrayList;
import java.util.List;

public class ArrayWithStack {
    public static List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int len = target.length;
        int t = 0;
        for (int i = 1; i <= n; i++) {
            if (t == len)
                break;
            if (target[t] == i) {
                operations.add("Push");
                t++;
            } else {
                operations.add("Push");
                operations.add("Pop");
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4};
        int n=4;
//        op - PUSH,PUSH,PUSH,POP,PUSH
        System.out.println(buildArray(arr,n));
    }
}
