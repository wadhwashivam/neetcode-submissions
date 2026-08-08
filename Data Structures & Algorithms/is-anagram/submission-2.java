class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        for (char c : sCharArray){
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (char c: tCharArray){
            int count = hm.getOrDefault(c, 0) - 1;

            if(count == 0){
                hm.remove(c);
            }else{
                hm.put(c, count);
            }

        }

        return hm.isEmpty();
    }
}
