class Solution {
    public int helperFunc(HashSet<Integer> set, int num, int res){
        if (!set.contains(num-1)) return res;
        res+=1;
        return helperFunc(set, num-1, res); 
    }
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        int max = 0;
        for (int numb : nums){
            int res = helperFunc(set, numb, 1);
            if (res> max) max = res;
        }
        return max;
    }
}
