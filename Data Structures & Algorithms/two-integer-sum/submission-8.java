class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>(); // store number and index
        for(int n = 0; n<nums.length;n++){
            int difference = target - nums[n];
            if(hm.containsKey(difference)){
                res[0] = hm.get(difference);
                res[1] = n;
            }
            hm.put(nums[n],n);
        }
        return res;
    }
}
