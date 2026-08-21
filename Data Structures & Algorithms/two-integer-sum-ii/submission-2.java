class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int l = 0;
        int r = numbers.length -1;
        while(l<r){
            int currentSum = numbers[l] + numbers[r];
            if(currentSum< target){
                l++;
            }else if(currentSum> target){
                r--;
            }else{
                res[0] = l+1;
                res[1] = r+1;
                return res;
            }
        }
        return new int[0];
    }
}
