class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int top = 0;
        int bot = ROWS - 1;
        while(top<=bot){
            int targetRow = (top + bot) /2;

            if(target < matrix[targetRow][0]){
                bot = bot - 1;
            }else if (target > matrix[targetRow][COLS-1]){
                top = top + 1;
            }else{
                break;
            }
        }
        if(!(top<=bot)){
            return false;
        }

        int row = (top + bot)/2;

        int l = 0;
        int r = COLS - 1;
        while(l <= r){
            int targetCell = (l+r)/2;

            if(target < matrix[row][targetCell]){
                r = r - 1;
            }else if(target > matrix[row][targetCell]){
                l = l + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
