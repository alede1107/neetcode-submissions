class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*
            what do i want
            I want a group of three numbers that add up to 0

            inputs:
            array of nums

            constraints:
            cannot repeat triplets

            how will we achieve our goals?
        */

        // sample input: [-1,0,1,2,-1,-4]
        //start at -1
        //maybe nested for loop?
        // no hashmaps or hashsets
        // brute force version: triple nested for loops
        // O(n^3)
        // could i create a new object? i have to make sure the same numbers don't repeat
        // could i make a hashset of a hashset?
        // the hashset contains the hashset of one solution
        // that way if there is another hashset with the same solution, we can cancel it out
        // doesn't work because when we add values to the set, it doesn't track duplicates
        // maybe still works?
        List<List<Integer>> list = new ArrayList<>();
        HashSet<HashSet<Integer>> seen = new HashSet<>();

        for (int i = 0; i< nums.length; i++){
            for (int j = 1 ; j< nums.length; j++){
                for (int k = 2; k< nums.length; k++){
                    int check = nums[i] + nums[j] + nums[k];
                    // check all indexes are individual
                    if (i!= j && i!= k && k!= j){
                        if (check == 0){
                            HashSet<Integer> set = new HashSet<>();
                            set.add(nums[i]);
                            set.add(nums[j]);
                            set.add(nums[k]);
                            if (!seen.contains(set)){
                                seen.add(set);
                                List<Integer> add = new ArrayList<>();
                                add.add(nums[i]);
                                add.add(nums[j]);
                                add.add(nums[k]);

                                list.add(add);
                                // we are getting the right idea
                                // now we have to make sure indexes are distinct
                                // and that values arent repeated
                                // seems like the same issue
                                // also this solution is way too inefficient
                                // are there any other methods?
                                // let's go with a hashset for now
                            }
                            
                        }
                    }
                    
                }
            }
        }
        return list;
    }
}
