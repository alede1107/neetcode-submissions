class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        res = []
        count = {}
        maxCount = 0

        for num in nums:
            if num not in count:
                count[num] = 0
            count[num] += 1
        maxNum = max(count.values())

        keys = list(count)
        print(keys)

        i = 0

        while i < len(keys):
            if k == 0:
                return res
            key = keys[i]
            if count[key] == maxNum:
                res.append(key)
                count[key] = -1
                maxNum = max(count.values())
                i = 0
                k -= 1
            else:
                i += 1
        return res
'''
1: 4
5: 2
3: 2
73: 1
maxNum = 4
[1, 5, 3, 7]
'''
            