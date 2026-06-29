class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if (map.containsKey(diff) && (i != map.get(diff))){
                if (i > map.get(diff)){
                    res[0] = map.get(diff);
                    res[1] = i;
                }
                else{
                    res[1] = map.get(diff);
                    res[0] = i;
                } 
                return res;
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
