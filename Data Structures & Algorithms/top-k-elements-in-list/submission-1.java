class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // rough version of code
        HashSet<Integer> seen = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];

        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        /*
            at this stage we have:
                1: 1
                2: 2
                3: 3
            hashmap has been set, now it is about getting
            the top K frequent elements into res
        */
        //at this point, we just need to make sure res has 
        // something to compare to

        /*
        int iterator = 0;
        for (int i : map.keySet()){
            if (iterator >=k) break;
            res[iterator] = i;
            iterator++;
        }
        */

        /* 
            at this point, the res array has substance, but 
            not the k most frequent elements
            it might look something like this:
                [1, 2]
        */

        /*
            now we have to put the correct elements into the array
            how do we do that?

            1. iterate over key set (if key not in seen)
            2. compare values with items in res (if key not in seen) 
            3. once we determine which is the largest of the 
                keyset item and all of res items, we replace minimum
                with maximum, also adding maximum key to seen
        */
        /*
            the other solution looks to complicated
            get the k most frequent nums
        */
        
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
