class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0;i<numbers.length;i++){
            int difference = target - numbers[i];
            if(hm.containsKey(difference)){
                res[0] = hm.get(difference);
                res[1] = i+1;
                return res;
            }
            hm.put(numbers[i], i+1);
        }
        return new int[0];
    }
}
