class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        String res = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int max = Math.max(c1.length, c2.length);
        for (int i=0; i<max; i++){
            if (i<c1.length){
                res+=c1[i];
            }
            if (i<c2.length){
                res+=c2[i];
            }
        }
        return res;
    }
}