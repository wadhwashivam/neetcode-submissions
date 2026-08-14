class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int n : nums){
            hm.put(n, hm.getOrDefault(n,0)+1);
        }

        ArrayList<Integer>[] buckets = new ArrayList[nums.length+1];
        for (int n = 0;n<buckets.length;n++){
            buckets[n] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        for(int i = buckets.length -1;i>0 && index<k;i--){
            for(int n: buckets[i]){
                res[index] = n;
                index++;
                if (index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
