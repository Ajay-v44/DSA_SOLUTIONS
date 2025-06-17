package PrefixOrSuffixSum;

import java.util.HashMap;

public class subArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int k = 2;
        System.out.println(countNumberOfSubArrays(arr, k));
    }

    static int countNumberOfSubArrays(int[] arr, int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        frequencyMap.put(0, 1);
        for (int num : arr) {
            prefixSum += num;
            if (frequencyMap.containsKey(prefixSum - k)) {
                count += frequencyMap.get(prefixSum - k);
            }
            frequencyMap.put(prefixSum, frequencyMap.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}
