class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[k];

        for (int n: nums){
            hm.put(n, hm.getOrDefault(n,0)+1);
        }

        ArrayList<Integer>[] buckets = new ArrayList[nums.length+1];
        for (int i=0;i<buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry: hm.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }
        int index = 0;
        for (int i = buckets.length -1;i>0 && index<k;i--){
            for(int n: buckets[i]){
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
