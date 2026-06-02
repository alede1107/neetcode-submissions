class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] abc = new int[26];
        char[] newS = s.toCharArray();
        char[] newT = t.toCharArray();

        for (int i = 0; i< s.length(); i++){
            abc[newS[i]-'a']++;
            abc[newT[i]-'a']--;
        }
        for (int j = 0; j<abc.length; j++){
            if (abc[j] !=0) return false;
        }
        return true;

    }
}
