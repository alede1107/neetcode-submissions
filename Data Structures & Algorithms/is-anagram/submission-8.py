class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        countS = {}
        countT = {}

        if len(s) != len(t):
            return False
        for i in range(len(s)):
            if s[i] not in countS:
                countS[s[i]] = 0
            if t[i] not in countT:
                countT[t[i]] = 0
            
            countS[s[i]]+=1
            countT[t[i]]+=1
        return countS == countT

        