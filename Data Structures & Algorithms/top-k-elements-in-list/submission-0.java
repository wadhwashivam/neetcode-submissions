class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[k];

        for (int i : nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }

        ArrayList<Integer>[] buckets = new ArrayList[nums.length+1];
        // We are creating a new arraylist in each bucket since it can have multiple values.
        for (int i = 0; i< buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry: hm.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        for (int i = buckets.length -1;i> 0 && index<k;i--){
            for (int n: buckets[i]){
                res[index] = n;
                index++;
                if(index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
