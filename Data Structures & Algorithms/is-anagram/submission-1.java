class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i =0;i<s.length();i++){
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c,0) +1);
        }

        for (int j = 0;j<t.length();j++){
            char c = t.charAt(j);
            if (!hm.containsKey(c)){
                return false;
            }
            hm.put(c,hm.get(c) -1);
            if (hm.get(c) == 0){
                hm.remove(c);
            }
        }
        return hm.isEmpty();
    }
}
