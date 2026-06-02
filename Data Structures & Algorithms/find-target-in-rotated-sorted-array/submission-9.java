/*
Before Coding:
    - restate problem in own words
    - ask about input constraints/edge cases
    - discuss at least 2 approaches
    - state time/space complexity of chosen approach

During Coding:
    - talk about what you're writing
    - use meaningful variable names
    - write modular/clean code
    - handle edge cases 

After Coding:
    - walk through code with an example
    - test edge cases manually
    - identified and fixed bugs
    - discussed potential optimizations

Things to consider:
    - DSA
    - Communication
    - Coding
    - Speed
*/

/*
Before Coding:
    - restate problem in own words:
after an int array has been rotated n times, the program
must find the target int in an array of int

if it's not there, return -1



    - ask about input constraints/edge cases:
all elements are unique
are they in order? yes
what if empty? return -1
what are we returning? index


    - discuss at least 2 approaches
1. We could continue with the binary search algo we had previously
to find the minimum. the added nuance is the ability to know 
which direction to pursue

2. Of course there is always the brute force method, but the problem states
O(log n) time. the brute force method would include 
for (int num : nums) if (num == target) return index of num.

    - state time/space complexity of chosen approach
time: O(logn)
space: O(1) - no extra space will be necessary. we are just searching
through the array.

*/


class Solution {
    public int search(int[] nums, int target) {
        //empty array
        if (nums.length == 0) return -1;

        //array of 1
        if (nums.length ==1){
            if (nums[0] == target) return 0;
            else return -1;
        }

        //start at middle
        int mid = (nums.length-1)/2;


        //pointers
        int l=0, r = nums.length-1;
        
        //check if we got it the first time
        if (nums[mid] == target) return mid;
        
        //[5,1,2,3,4]

        // l = 0, r = 4
        // mid = 2
        while (l < r){

            // check left half-array
            if ((mid-1) >= l 
            && target <= Math.max(nums[l], nums[mid-1])
            && target >= Math.min(nums[l], nums[mid-1])){
                if (nums[mid-1] == target) return mid-1;
                r = mid-1;
                mid = (mid-1 + l)/2;
            }
            else {
                if (nums[mid+1] == target) return mid+1;
                l = mid+1;
                mid = (mid + r)/2;
            }
            //keep checking after loop
            if (nums[mid] == target) return mid;
            
        }
        return -1;
    }
}
