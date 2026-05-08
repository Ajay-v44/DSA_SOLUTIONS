package Array;

import java.util.*;

public class Leetcode3629 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; // No factors found, it is prime
    }

    public static int minJumps(int[] nums) {
        int n = nums.length;
        int steps = 0;
        for (int i = 0; i < n; i++) {
            steps++;
            if (isPrime(nums[i])) {
                if (nums[n - 1] % nums[i] == 0) break;
                int reduction = n - 1;
                while (nums[reduction - 1] % nums[i] != 0) {
                    reduction--;
                }
                if (reduction > i) {
                    i = reduction;
                }
            }
        }
        return steps;
    }


    static final int MAXV = 1000001;

    static int[] spf = buildSPF();

    static int[] buildSPF() {

        int[] spf = new int[MAXV];

        for (int i = 0; i < MAXV; i++) {
            spf[i] = i;
        }

        spf[0] = 0;
        spf[1] = 1;

        for (long i = 2; i * i < MAXV; i++) {

            if (spf[(int) i] == i) {

                for (long j = i * i; j < MAXV; j += i) {

                    if (spf[(int) j] == j) {
                        spf[(int) j] = (int) i;
                    }
                }
            }
        }

        return spf;
    }

    boolean isPrimeV2(int x) {

        return x >= 2 && spf[x] == x;
    }

    public int minJumpsV2(int[] nums) {

        int n = nums.length;

        if (n == 1) return 0;

        int maxi = 0;

        for (int x : nums) {
            maxi = Math.max(maxi, x);
        }

        // store which prime numbers are present
        boolean[] primeSeen = new boolean[maxi + 1];

        for (int x : nums) {

            if (isPrime(x)) {
                primeSeen[x] = true;
            }
        }

        // prime -> divisible indices
        HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int x = nums[i];

            if (x == 1) continue;

            while (x > 1) {

                int p = spf[x];

                if (p <= maxi && primeSeen[p]) {

                    mp.putIfAbsent(p, new ArrayList<>());
                    mp.get(p).add(i);
                }

                while (x % p == 0) {
                    x /= p;
                }
            }
        }

        int[] dist = new int[n];
        Arrays.fill(dist, -1);

        boolean[] usedPrime = new boolean[maxi + 1];

        Queue<Integer> q = new LinkedList<>();

        q.offer(0);
        dist[0] = 0;

        while (!q.isEmpty()) {

            int idx = q.poll();

            if (idx == n - 1) {
                return dist[idx];
            }

            // left
            if (idx - 1 >= 0 && dist[idx - 1] == -1) {

                dist[idx - 1] = dist[idx] + 1;
                q.offer(idx - 1);
            }

            // right
            if (idx + 1 < n && dist[idx + 1] == -1) {

                dist[idx + 1] = dist[idx] + 1;
                q.offer(idx + 1);
            }

            int x = nums[idx];

            // teleportation
            if (isPrimeV2(x) && !usedPrime[x]) {

                usedPrime[x] = true;

                if (mp.containsKey(x)) {

                    for (int nextIdx : mp.get(x)) {

                        if (dist[nextIdx] == -1) {

                            dist[nextIdx] = dist[idx] + 1;
                            q.offer(nextIdx);
                        }
                    }
                }
            }
        }

        return -1;
    }

    static void main() {
        int[] nums = {2, 3, 4, 7, 9};
        System.out.println(minJumps(nums));
    }
}
