class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*
            here is thinking space
            
            input type: array of strings
            output type: list of lists of strings

            i need to break up the array of strings into groups of anagrams

            how can i do that?

            hashmap?

            think about it

            if i had ["act", "cat", "stop"]
            i would want to separate "act" and "cat" into a separate list than "stop", 
            and then make a bigger list to contain both

            what unites "act", and "cat"?

            what was the logic for the previous anagram question?

            abc[(characterOfS) - 'a']++
            abc[(characterOfT) - 'a']--
            then they would equal 0
            this wont work because it's not comparing two strings anymore

            what is a defining characteristic of a string that could unite two different words that 
            are anagrams?

            take for example "act".
            the letters 'a', 'c', 't' are used
            no more no less
            so there might be need of a hashset. except that only contains 1 item

            maybe a hashmap within a hashmap?
            where you can count the number of times a character has been used?
            interesting

            pseudocode:
            //scan through each word, making a hashmap aligning characters to number of times they show up
            hashmap<hashmap, list<string>> map
            for string in strs:
                //if their hashmap already exists, no need to create and add the value. simply add to the value list
                new hashmap<char, int> stringmap
                for char in string:
                    stringmap.put(char, stringmap.get(char)+1);
                if map.containsKey(stringmap), map.get(stringmap).add(string)
                else map.put(stringmap, list(containing string))
        */
        HashMap<HashMap<Character, Integer>, List<String>> map = new HashMap<>();
        for (String s : strs){
            HashMap<Character, Integer> stringmap = new HashMap<>();
            for (char c : s.toCharArray()){
                stringmap.put(c, stringmap.getOrDefault(c, 0)+1);
            }
            if (map.containsKey(stringmap)) map.get(stringmap).add(s);
            else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(stringmap, list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (List<String> lists : map.values()){
            res.add(lists);
        }
        return res;


    }
}
