package Array;

public class ConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0)
            return 0;
        int maxOnes = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                maxOnes = Math.max(maxOnes, count);
                count = 0;
            }
        }
        maxOnes = Math.max(maxOnes, count);
        return maxOnes;
    }

    public static void main(String[] args) {
        int[] nums={0,0,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
