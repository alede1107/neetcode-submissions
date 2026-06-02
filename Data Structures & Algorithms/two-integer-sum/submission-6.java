class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int [] res = new int[2];
        for (int i =0; i<nums.length;i++){
            map.put(nums[i], i);
        }
        for (int j = 0; j<nums.length;j++){
            int diff = target-nums[j];
            if (map.containsKey(diff)&&j!=map.get(diff)){
                if (j<map.get(diff)){
                    res[0]=j;
                    res[1]=map.get(diff);
                }
                else{
                    res[0]=map.get(diff);
                    res[1]=j;
                }
            }
        }
        return res;
    }
}
