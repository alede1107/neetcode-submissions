class Solution {
    public boolean isValid(String s) {
        /*
            example:
            "([{}])"
            make a stack
            ([{
            and a hashmap
            (:)
            [:]
            {:}
            if the char is equal to stack.pop(), continue to next char

        */
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for (char c : s.toCharArray()){
            if (map.containsKey(c)){
                if (stack.isEmpty() || map.get(c) != stack.pop()){
                    return false;
                }
            }
            else stack.push(c);
        }
        return stack.isEmpty();
    }
}
