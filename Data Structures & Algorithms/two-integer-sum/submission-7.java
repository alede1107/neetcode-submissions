class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int[] res = new int[2];
        for (int j =0;j<nums.length;j++){
            int diff = target-nums[j];
            if ((map.containsKey(diff))&&map.get(diff)!=j){
                if (map.get(diff)>j){
                    res[0]=j;
                    res[1]=map.get(diff);
                }
                else if (map.get(diff)<j){
                    res[1]=j;
                    res[0]=map.get(diff);
                }
            }
        }
        return res;
    }
}
