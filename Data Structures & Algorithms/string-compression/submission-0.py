class Solution:
    def compress(self, chars: List[str]) -> int:
        n = len(chars)
        k = i = 0

        while i < n:
            chars[k] = chars[i]
            k += 1
            j = i + 1
            while j < n and chars[i] == chars[j]:
                j += 1
            
            if j - i > 1:
                for c in str(j-i):
                    chars[k] = c
                    k += 1
            i = j
        return k
# ["1","1","2"]
# k = 0, i = 0
# k = 1
# j = 1
# j = 2
# ["1", "2", "2"]