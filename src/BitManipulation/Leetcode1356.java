package BitManipulation;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Leetcode1356 {
    static class Pair {
        int num;
        int count;

        Pair(int num, int count) {
            this.num = num;
            this.count = count;
        }
    }

    public static int[] sortByBits(int[] arr) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.count == b.count ? a.num - b.num : a.count - b.count);

        for (int j : arr) {
            pq.add(new Pair(j, Integer.bitCount(j)));
        }

        int k = 0;
        int[] ans = new int[arr.length];
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            ans[k] = p.num;
            k++;
        }

        return ans;
    }

    static void main() {
    int[] arr={0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
}
