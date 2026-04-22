class Solution {
    public int[] twoSum(int[] nums, int target) {
        int diff = 0;
        int n = nums.length;

        int[] ans = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i=0;i<n;i++){
            diff = target - nums[i];
            if (hm.containsKey(diff)){
                ans[1] = i;
                ans[0] = hm.get(diff);
            }else{
                hm.put(nums[i],i);
            }
        }
        return ans;
    }
}
