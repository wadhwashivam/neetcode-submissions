class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int l = 0;
        int maxF = 0;
        int res = 0;
        for(int r = 0;r<s.length();r++){
            hm.put(s.charAt(r), hm.getOrDefault(s.charAt(r),0) +1);
            maxF = Math.max(maxF, hm.get(s.charAt(r)));

            while((r-l+1) - maxF >k){
                hm.put(s.charAt(l), hm.get(s.charAt(l))-1);
                l++;
            }
            res = Math.max(res, r-l+1);
        }
        return res;
    }
}
