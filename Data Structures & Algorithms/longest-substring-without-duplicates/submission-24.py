class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        res = 0

        l = 0
        charSet = set()
        for r in range(len(s)):
            if s[r] not in charSet:
                charSet.add(s[r])
                res = max(res, r - l + 1)
            else:
                while l < r and s[r] in charSet:
                    charSet.remove(s[l])
                    l += 1
                charSet.add(s[r])
        return res