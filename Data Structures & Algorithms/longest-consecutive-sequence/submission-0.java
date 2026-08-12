class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int longest = 0;
        for (int n: nums){
            set.add(n);
        }

        for (int n : set){
            if (!set.contains(n-1)){
                int length = 1;
                while(set.contains(n + length)){
                    length ++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
