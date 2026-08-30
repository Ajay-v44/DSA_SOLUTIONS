

class Solution:
    def minimumDeletions(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        if n <= 2:
            return n

        min_idx = nums.index(min(nums))
        max_idx = nums.index(max(nums))

        # Ensure i is the left index and j is the right index
        i, j = min(min_idx, max_idx), max(min_idx, max_idx)

        # 1. Both from front: j + 1
        # 2. Both from back: n - i
        # 3. One from each end: (i + 1) + (n - j)
        return min(j + 1, n - i, (i + 1) + (n - j))