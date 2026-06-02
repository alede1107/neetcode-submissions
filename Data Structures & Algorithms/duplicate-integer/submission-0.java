class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i =0; i<nums.length-1;i++){
            for (int j=nums.length-1;(j!=i)&&(j>0);j--){
                if (nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}