class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[ '!,.:<>/?@#$%^&*]", "");
        s= s.toLowerCase();
        String newString = "";
        for (int i =s.length()-1;i>=0;i--){
            newString+=s.charAt(i);
        }
        if(newString.equals(s)){
            return true;
        }
        System.out.println(newString);
        return false;
    }
}
