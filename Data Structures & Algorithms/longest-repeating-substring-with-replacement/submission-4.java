class Solution {
    public int characterReplacement(String s, int k) {
        int maxF = 0;
        int l = 0;
        int res = 0;
    
        HashMap<Character, Integer> map = new HashMap<>();

        for(int r = 0;r<s.length();r++){
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) +1);
            maxF = Math.max(maxF, map.get(c));

            while((r-l+1) - maxF > k){
                map.put(s.charAt(l),map.get(s.charAt(l)) -1);
                l++;
            }

            res = Math.max(res, (r-l+1));
        }

        return res;
    }
}
