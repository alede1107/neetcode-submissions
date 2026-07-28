class Solution:
    def isPalindrome(self, s: str) -> bool:
        if not s:
            return True
        
        s = s.lower()

        l, r = 0, len(s) - 1

        while l <= r:
            while l <= r and s[l].isalnum() == False:
                l += 1
            while l <= r and s[r].isalnum() == False:
                r -= 1
            
            if l > r:
                return True
            
            print(f"{s[l]} and {s[r]}")

            if s[l] != s[r]:
                return False
            l += 1
            r -= 1
        return True