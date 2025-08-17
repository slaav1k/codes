class Solution:
    def new21Game(self, n: int, k: int, maxPts: int) -> float:
        if k == 0 or n >= k - 1 + maxPts:
            return 1.0

        dp = [0.0] * (n + maxPts + 1)

        for i in range(k, n + 1):
            dp[i] = 1.0

        window_sum = n - k + 1
        for x in range(k - 1, -1, -1):
            dp[x] = window_sum / maxPts
            window_sum += dp[x] - dp[x + maxPts]

        return round(dp[0], 5)



solution = Solution()

print(solution.new21Game(10, 1, 10))
print(solution.new21Game(6, 1, 10))
print(solution.new21Game(21, 17, 10))

