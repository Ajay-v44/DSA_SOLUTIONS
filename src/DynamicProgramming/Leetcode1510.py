class Solution:
    def winnerSquareGame(self, n: int) -> bool:
        # dp[i] will be True if the current player can win with i stones, else False
        dp = [False] * (n + 1)

        for i in range(1, n + 1):
            # Try removing every possible square number j*j <= i
            j = 1
            while j * j <= i:
                # If removing j*j stones leaves the opponent in a losing state,
                # then the current player can win.
                if not dp[i - j * j]:
                    dp[i] = True
                    break
                j += 1

        return dp[n]