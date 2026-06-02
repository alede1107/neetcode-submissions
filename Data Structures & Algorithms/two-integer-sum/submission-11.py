class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        myDict = {}
        for i, n in enumerate(nums):
            myDict[n] = i
        for i, n in enumerate(nums):
            diff = target - n
            if diff in myDict and myDict[diff] != i:
                return [i, myDict[diff]]
        res = []
        return res