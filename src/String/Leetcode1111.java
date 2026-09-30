package String;

public class Leetcode1111 {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] res = new int[n];

        for (int i = 0; i < n; i++)
            res[i] = (i ^ seq.charAt(i)) & 1;
        return res;
    }
    static void main() {

    }
}
