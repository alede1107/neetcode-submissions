class Solution {
    public int firstMissingPositive(int[] nums) {
        int min = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            if (num < min) min = num;
            set.add(num);
        }
        while (nums.length == nums.length){
            if (!set.contains(min) && min > 0){
                return min;
            }
            min++;
        }
        return min;

    }
}