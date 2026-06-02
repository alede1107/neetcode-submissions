class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        if (s.length()!=t.length()){
            return false;
        }
        
        for (char c: s.toCharArray()){
            if (!mapS.containsKey(c)){
                mapS.put(c,1);
            }
            else{
                mapS.put(c, mapS.get(c)+1);
            }
        }
        for (char n: t.toCharArray()){
            if (!mapT.containsKey(n)){
                mapT.put(n,1);
            }
            else{
                mapT.put(n, mapT.get(n)+1);
            }
        }
        return mapS.equals(mapT);
    }
}
