class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arrS = new int[26];
        int[] arrT = new int[26];
        for (char c : s.toCharArray()){
            arrS[c-'a']++;
        }
        for (char c : t.toCharArray()){
            arrT[c-'a']++;
        }
        return Arrays.equals(arrT, arrS);
    }
}
