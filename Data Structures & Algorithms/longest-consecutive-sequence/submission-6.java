class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int n:nums){
            set.add(n);
        }

        for (int i: set){
            if(!set.contains(i-1)){
                int length = 0;
                while(set.contains(i+length)){
                    length++;
                }
                longest = Math.max(longest, length);
            }

        }
        return longest;
    }
}
