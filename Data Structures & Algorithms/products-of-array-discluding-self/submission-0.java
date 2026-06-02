class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] copy = nums.clone();
        for (int i =0; i<nums.length; i++){
            int temp = nums[i];
            nums[i]=1;
            
            for (int j=0; j<nums.length; j++){
                if (i!=j){
                    
                    nums[i] *= nums[j];
                    
                }
            }
            copy[i] = nums[i];
            nums[i] = temp;
        }
        return copy;
    }
}