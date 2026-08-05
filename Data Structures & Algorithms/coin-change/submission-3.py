class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        ans = [amount + 1] * (amount + 1)

        ans[0] = 0
        for i in range(1, amount + 1):
            for coin in coins:
                if i - coin >= 0:
                    ans[i] = min(ans[i], ans[i-coin] + 1)
        if ans[amount] != amount + 1:
            return ans[amount]
        else:
            return -1