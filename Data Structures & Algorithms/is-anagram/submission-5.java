class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hmS = new HashMap<>();
        HashMap<Character, Integer> hmT = new HashMap<>();

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for (char c : sArray){
            hmS.put(c, hmS.getOrDefault(c, 0) + 1);
        }

        for (char c : tArray){
            hmT.put(c, hmT.getOrDefault(c, 0) + 1);
        }

        return hmS.equals(hmT);
    }
}
