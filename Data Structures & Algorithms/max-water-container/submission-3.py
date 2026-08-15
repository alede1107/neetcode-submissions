class Solution:
    def maxArea(self, heights: List[int]) -> int:

        l, r = 0, len(heights) - 1
        maxWater = 0


        while l < r:
            width = r - l
            height = min(heights[l], heights[r])
            maxWater = max(maxWater, width * height)

            if heights[l] < heights[r]:
                l += 1
            elif heights[r] < heights[l]:
                r -= 1
            else:
                l += 1
                r -= 1
        return maxWater
