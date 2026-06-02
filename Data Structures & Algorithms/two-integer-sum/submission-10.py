class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = {}
        res = []
        for i, n in enumerate(nums):
            hashMap[n] = i
        for j, num in enumerate(nums):
            diff = target - num
            if diff in hashMap and hashMap[diff] != j:
                return [j, hashMap[diff]]
        return res