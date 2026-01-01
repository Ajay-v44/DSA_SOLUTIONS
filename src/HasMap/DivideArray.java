package HasMap;

import java.util.HashMap;
import java.util.Map;

public class DivideArray {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 2, 2, 2};
        System.out.println(checkIfArrayIsDivisible(nums));
    }

    static boolean checkIfArrayIsDivisible(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int element : arr) {
            if (map.containsKey(element))
                map.put(element, map.get(element) + 1);
            else
                map.put(element, 1);
        }
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            System.out.println("key "+item.getKey()+" value "+item.getValue());
            if (item.getValue() % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
