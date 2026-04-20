class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0;i<nums.length;i++){
            if (hs.contains(nums[i])){
                flag= true;
            }
            hs.add(nums[i]);
        }
        return flag;
    }
}