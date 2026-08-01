    def predictTheWinner(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        memo={}

        def helper(i,j):
            if i>j:
                return 0
            if i==j:
                return nums[i]

            if (i,j) in memo:
                return memo[(i,j)]
            # Choice 1: Pick left (nums[i]) and subtract what opponent gets from remaining (i+1, j)
            pick_left = nums[i] - helper(i + 1, j)

            # Choice 2: Pick right (nums[j]) and subtract what opponent gets from remaining (i, j-1)
            pick_right = nums[j] - helper(i, j - 1)

            memo[(i, j)] = max(pick_left, pick_right)
            return memo[(i, j)]

        # If Player 1's net score difference is >= 0, they win or tie.
        return helper(0, len(nums) - 1) >= 0