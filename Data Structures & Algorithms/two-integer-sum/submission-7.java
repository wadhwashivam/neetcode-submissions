class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int[] res = new int[2];
        for (int i = 0;i<nums.length;i++){
            int difference = target - nums[i];

            if (hm.containsKey(difference)){
                res[0] = hm.get(difference);
                res[1] = i;
            }

            hm.put(nums[i],i);
        }
        return res;
    }
}
