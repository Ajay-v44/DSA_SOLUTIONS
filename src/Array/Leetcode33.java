package Array;

public class Leetcode33 {
    public int searchBruteForce(int[] nums, int target) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return index;
    }

    public int searchOPT(int[] nums, int target) {
        int s = 0, e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[s] <= nums[mid]) {
                if (nums[s] <= target && nums[mid] >= target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] <= target && nums[e] >= target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        return -1;
    }

    void main() {

    }
}
