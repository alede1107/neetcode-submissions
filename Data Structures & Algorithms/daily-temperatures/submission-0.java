class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //sliding windows technique

        /*
        what are we trying to solve??
        we have any given day. we want to know how many days until the next
        hottest day

        some ways to approach this:

        edge cases:
        array empty = return 0
        place a zero in that index

        possible solutions:
        nested for loops
        O(n^2) time, O(1) space

        HashMap where you stash index

        Sliding window technique
        
        */

        //nested for loops 

        int[] res = new int[temperatures.length];
        for (int i = 0; i< temperatures.length; i++){

            for (int j = 1; j < temperatures.length; j++){
                if (temperatures[j] > temperatures[i] && j > i){
                    res[i] = j-i;
                    break;
                }
            }
        }
        return res;
    }
}

