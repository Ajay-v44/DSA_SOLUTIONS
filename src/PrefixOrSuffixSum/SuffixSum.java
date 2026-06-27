package PrefixOrSuffixSum;

public class SuffixSum {
    public int[] createSuffix(int[] arra) {
        int n = arra.length;
        int[] suffix = new int[n];
        suffix[n - 1] = arra[n - 1];
        for (int i = arra.length - 2; i >= 0; i--) {
            suffix[i] = arra[i] + suffix[i + 1];
        }
        return suffix;
    }

    static void main() {

    }
}
