class Solution {
    public int romanToInt(String s) {
        //rules:
        /*
        1. largest to smallest from left to right
        2. represented as 7 different symbols:
            I, V, X, L, C, D
        3. four is written as IV and six is written as VI
        4. 6 instances where subtraction is used
            I before V -> 4 5-1
            I before X -> 9 
            X before L -> 40
            X before C -> 100
            C before D -> 400
            C before M -> 900
        */
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int res = 0;

        char[] str = s.toCharArray();

        for (int i = 0; i<str.length; i++){
            if (i > 0 && str[i-1] == 'I' && (str[i] == 'V' || str[i] == 'X') ){
                res += map.get(str[i])-2;
            }
            else if (i > 0 && str[i-1] == 'X' && (str[i] == 'L' || str[i] == 'C') ){
                res += map.get(str[i])-20;
            }
            else if (i > 0 && str[i-1] == 'C' && (str[i] == 'D' || str[i] == 'M') ){
                res += map.get(str[i])-200;
            }
            else res += map.get(str[i]);
        }
        return res;
    }
}