class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length*2];
        int length = nums.length;
        for (int i = 0;i< nums.length;i++){
            res[i] = nums[i];
            res[i+length] = nums[i];
        }
        return res;
    }
}