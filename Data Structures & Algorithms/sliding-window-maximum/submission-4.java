class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n-k+1];

        Deque<Integer> q = new LinkedList<>();

        int l = 0;
        int r = 0;
        while(r<n){
            while(!q.isEmpty() && nums[q.getLast()]< nums[r]){
                q.removeLast();
            }
            q.addLast(r);

            // If window does not include the first element, which means the l pointer moves but the queue still store the same highest value as l then we need to remove it.
            if(l > q.getFirst()){
                q.removeFirst();
            }

            //If the window size reaches k size then append the max value in the output.
            if((r+1) >= k){
                output[l] = nums[q.getFirst()];
                l++;
            }
            r++;
        }
        return output;
    }
}
