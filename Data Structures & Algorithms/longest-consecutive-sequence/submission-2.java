class Solution {
    public int helperFunc(int num, HashSet<Integer> set, int res){
        if (!set.contains(num+1)){
            return res;
        }
        res +=1;
        return helperFunc(num+1, set, res);

    }
    public int longestConsecutive(int[] nums) {
        /*
            what is the goal?
            we want to take each number in nums
            then find if there is a number greater than that by 1
            the original number could be anywhere


            could recursion play a part?
            maybe make a helper function

        */
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        int max = 0;
        for (int i =0; i< nums.length; i++){
            int res = helperFunc(nums[i], set, 1);
            if (res > max) max = res;
        }
        
        return max;
    }
}
