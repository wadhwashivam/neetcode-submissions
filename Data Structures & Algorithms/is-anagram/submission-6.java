class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for (char i : sArr){
            countS.put(i, countS.getOrDefault(i,0)+1);
        }
        for (char j : tArr){
            countT.put(j, countT.getOrDefault(j,0)+1);
        }

        return countS.equals(countT);
    }
}
