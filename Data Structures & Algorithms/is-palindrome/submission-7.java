class Solution {
    public boolean isPalindrome(String s) {
      s=s.replaceAll("[ !@#$%^&*(){}|\';,./<>:?']", "");
      s=s.toLowerCase();
      int left = 0;
      int right = s.length()-1;

      
      while (left<right){
        if (s.charAt(left)!=(s.charAt(right)))
            return false;
        left+=1;
        right-=1;
      }
      return true;  
    }
}
