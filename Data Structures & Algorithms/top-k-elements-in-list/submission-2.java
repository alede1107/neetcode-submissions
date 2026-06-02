class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //cleaned up version
        HashSet<Integer> seen = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];

        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        for (int i =0; i<k; i++){
            int max = -10000;
            for (int key : map.keySet()){
                if (!seen.contains(key) && map.get(key) > 
                map.getOrDefault(max, 0))
                {
                    max = key;
                }
            }
            res[i] = max;
            seen.add(max);
        }
        
        return res;
    }
}
