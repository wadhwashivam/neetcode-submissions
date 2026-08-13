class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        for (String c : strs){
            char[] cArr = c.toCharArray();
            Arrays.sort(cArr);

            String key = new String(cArr);
            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(c);
        }

        return new ArrayList<>(hm.values());
    }
}
