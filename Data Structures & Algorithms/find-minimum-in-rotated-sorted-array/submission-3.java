class Solution {
    public int findMin(int[] nums) {
        // what was binary search again?
        // [1,2,3,4,5,6]
        // start in the middle (this case would be 4... or 3 idk)
        // if the value we're searching is less, search left of the middle
        // if the value is greater, search right of middle

        //ok now implement binary search
        int min = Integer.MAX_VALUE;
        int l = 0, r = nums.length-1;
        int mid = (nums.length-1)/2; //mid index = 2 in the example
        if (nums.length == 1) return nums[0];
        // how do we implement a binary search?
        while (l < r){
            
            /*Absolutes: 
                    - left is less than right: left is min
                    - mid-1 > mid, mid = min
                    - mid+1 < mid, mid+1 = min
                    - left > mid, min on the left side, but not left
            */
            if (nums[mid] < min) min = nums[mid];
            if (nums[l] < nums[r]){
                min = Math.min(nums[l], min);
                break;
            }
            if ((mid-1 > l) && nums[mid-1] > nums[mid]){
                min = Math.min(min, nums[mid]);
                break;
            }
            if (nums[mid+1] < nums[mid]){
                min = Math.min(nums[mid+1], min);
                break;
            }
            if (nums[l] > nums[mid]){
                r = mid-1;
                mid = (l+r-1)/2;
            }
            else{
                l = mid+1;
                mid = (l+r-1)/2;
            } 


            // how do i break up left and right. preferably no recursion
            // would it preferable to rotate until i have the right mid?
            // how would i know how many times it has been rotated?
            // **it has for sure been rotated between 1 and n times
            // in this case, n = 6
            // **remember this array is sorted
            // **all elements are unique
            // radix sort method? blargh
            //possible combos:
            /*  
                * = mid
                ** = min
                [1**,2,3*,4,5,6]
                    min is to the left
                    left is less than right
                    left is less than mid

                [2,3,4*,5,6,1**]
                    min is to the right
                    right is less than left
                    left is less than mid

                [3,4,5*,6,1**,2]
                    min is to the right
                    right is less than left
                    left is less than mid

                [4,5,6*,1**,2,3]
                    min is to the right
                    right is less than left
                    left is less than mid

                [5,6,1**,2,3,4]
                    min is mid
                    right is less than left
                    left is more than mid

                [6,1**,2*,3,4,5]
                    min is to the left
                    right is less than left
                    left is more than mid

                left is less than right: equally balanced, left is min
                left is more than right: rotated
                additionally, if mid-1 > mid, mid = min

                

                left is more than mid, then mid is on the left side

            */
            

            // what we have so far: the mid element

        }
        return min;
    }
}
