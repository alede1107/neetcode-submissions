class Solution {
    public int scoreOfString(String s) {
        char[] c = s.toCharArray();
        int res =0;
        for (int i =0; i<c.length; i++){
            if ((i+1)<c.length){
                int a = c[i];
                int b = c[i+1];
                res+= Math.abs(a-b);
            }
        }
        return res;
    }
}