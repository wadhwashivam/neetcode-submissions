class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int res = 0;

        int l = 1;
        int r = 1;
        for(int pile : piles){
            r = Math.max(r, pile);
        }

        
        while(l<=r){
            int m = l+(r-l)/2;

            long totalTime = 0;
            for(int pile: piles){
                totalTime += Math.ceil((double)pile/m);
            }

            if(totalTime <= h){
                res = m;
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return res;
    }
}
