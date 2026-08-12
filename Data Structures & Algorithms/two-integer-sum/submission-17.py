class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = {}

        for i in range(len(nums)):
            num = nums[i]
            diff = target - num

            if diff in d:
                if i < d[diff]:
                    return [i, d[diff]]
                return [d[diff], i]
            d[num] = i
        return -1