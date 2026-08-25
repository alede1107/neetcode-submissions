class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        table = defaultdict(int)
        table[0] = 1

        curSum = count = 0
        for num in nums:
            curSum += num
            diff = curSum - k

            count += table[diff]
            table[curSum] += 1
        return count