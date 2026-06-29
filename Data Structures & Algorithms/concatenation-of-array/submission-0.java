class Solution {
    public int[] getConcatenation(int[] nums) {
        int doub = 2 * nums.length;
        int[] res = new int[doub];
        int len = nums.length;

        for (int i = 0; i < nums.length; i++){
            res[i] = nums[i];
            res[i + len] = res[i];
        }
        return res;
    }
}