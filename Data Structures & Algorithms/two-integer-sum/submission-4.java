class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i=0;i<nums.length;i++){

            int difference = target - nums[i];

            if (hm.containsKey(difference)){
                res[0] = hm.get(difference);
                res[1] = i;
            }

            hm.put(nums[i], i);
        }

        return res;

    }
}
