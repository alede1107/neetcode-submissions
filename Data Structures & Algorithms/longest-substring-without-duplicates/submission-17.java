/*
what are we trying to solve? 
longest substring without duplicate characters

what does this look like?
for pwwkew:
    my original thought was that 'kew' would be the longest
    but it starts at the second 'w'

edge cases: 
    empty string -> 0

how do we solve this?
example: zxyzxyz
    sliding window:
        start l at 0, r at 1
        as long as s[l] != s[r], r++
        if s[l]==s[r],
            add max to a set of max nums
            l++ as long as s[l] != s[r]

*/


class Solution {
    public int lengthOfLongestSubstring(String s) {
        //zero case
        if (s.length() == 0) return 0;

        //one case
        if (s.length() == 1){
            return 1;
        }
        HashSet<Character> chars = new HashSet<>(); //O(n) space
        int l=0, r=1;
        int count = 1, max = 0;
        
        char[] sChars = s.toCharArray();
        chars.add(sChars[0]);

        while (l < r && r<sChars.length){
            count = r-l+1;
            
            if (chars.contains(sChars[r])){
                count--;
                
                while (l < r){
                    if (sChars[l] == sChars[r]){
                        chars.remove(sChars[l]);
                        l++;
                        break;
                    }
                    chars.remove(sChars[l]);
                    l++;
                }
                
                
            }
            max = Math.max(count, max);
            chars.add(sChars[r]);
            r++;
        }
        return max;

    }
}
