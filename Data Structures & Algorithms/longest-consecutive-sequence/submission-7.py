class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        count = 0
        setNums = set(nums)

        for i in range(len(nums)):
            miniCount = 1
            num = nums[i]
            if num - 1 in setNums:
                continue
            while num + 1 in setNums:
                miniCount += 1
                num += 1
            count = max(count, miniCount)
        return count
