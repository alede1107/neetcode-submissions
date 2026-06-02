class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while (l<=r){
            int mid = (l+r)/2;

            if (nums[mid] == target){
                return mid;
            }
            //left side is sorted
            if (nums[l] <= nums[mid]){
                //number is on  right side
                if (target < nums[l] || target > nums[mid]){
                    l = mid+1;
                }
                else r = mid-1;
            }
            //right side is sorted
            else{
                if (target > nums[r] || target < nums[mid]){
                    r = mid-1;
                }
                else l = mid+1;
            }
        }
        return -1;
    }
}
