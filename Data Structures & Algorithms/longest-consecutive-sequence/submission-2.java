class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        HashSet<Integer> hs = new HashSet<>();

        for (int n: nums){
            hs.add(n);
        }

        for (int n:nums){
            if (!hs.contains(n-1)){
                int length = 1;
                while(hs.contains(n+length)){
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
