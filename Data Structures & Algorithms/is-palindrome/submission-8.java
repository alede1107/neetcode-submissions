class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[\\[\\];':/.,\"\\\\`~\\-+_=!@#$%^?&*()<>]", "");
        s = s.replaceAll(" ", "");
        System.out.println(s);
        //we now have a clean string
        /*
        what do i want?
        i need a pointer at the start and a pointer at the end
        when i subtract them from each other, they should equal 0
        what are edge cases?
        maybe an odd length?
        */
        // isn't there a recursive way to solve this?


        return helperFunc(s);
    }
    public boolean helperFunc(String s){
        int length = s.length();
        if (length == 0 || length ==1){
            return true;
        }
        if (s.charAt(0) == s.charAt(length-1)){
            return helperFunc(s.substring(1,length-1));
        }
        return false;
    }

}
