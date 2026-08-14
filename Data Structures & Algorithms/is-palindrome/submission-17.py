class Solution:
    def isPalindrome(self, s: str) -> bool:
        res = []

        for c in s.lower():
            if c.isalnum():
                res.append(c)
        resStr = "".join(res)
        print(resStr)
        l, r = 0, len(resStr) - 1

        while l <= r:
            if resStr[l] != resStr[r]:
                return False
            
            l += 1
            r -= 1
        return True