class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minNum = prices[0]
        maxP = 0

        for num in prices:
            minNum = min(minNum, num)
            maxP = max(maxP, num - minNum)
        return maxP

