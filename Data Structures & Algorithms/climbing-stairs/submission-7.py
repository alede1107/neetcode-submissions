class Solution:
    def climbStairs(self, n: int) -> int:
        memo = {}

        def dfs(num):
            if num <= 2:
                return num
            if num in memo:
                return memo[num]
            memo[num] = dfs(num - 1) + dfs(num - 2)
            return memo[num]
        return dfs(n)