class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //always must be a valid solution

        int l = 0, r = numbers.length-1;

        while (numbers[l] + numbers[r] != target){
            if (numbers[l] + numbers[r] > target){
                r--;
            }
            else if (numbers[l] + numbers[r] < target){
                l++;
            }
        }
        return new int[] {l+1, r+1};
    }
}
