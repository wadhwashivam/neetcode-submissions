class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for(char chs : s.toCharArray()){
            countS.put(chs, countS.getOrDefault(chs,0) + 1);
        }

        for(char cht : t.toCharArray()){
            countT.put(cht, countT.getOrDefault(cht, 0) + 1);
        }

        return countT.equals(countS);
    }
}
