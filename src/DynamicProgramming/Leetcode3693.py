class Solution:
    def climbStairs(self, n: int, costs: List[int]) -> int:
        dp = [float("inf")] * (n + 1)
        dp[0] = 0
        for j in range(1, n + 1):
            step_cost = costs[j - 1]
            min_prev = float("inf")

            for jump in (1, 2, 3):
                if j - jump >= 0:
                    min_prev = min(min_prev, dp[j - jump] + jump**2)

            dp[j] = step_cost + min_prev

        return dp[n]