class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> nmap;
        for (int i =0; i<size(nums); i++){
            nmap[nums[i]] = i;
        }
        for (int i = 0; i< size(nums); i++){
            int diff = target - nums[i];
            if (nmap.contains(diff) && nmap[diff] != i){
                return {i, nmap[diff]};
            }
        }
        return {};
    }
};
