class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();

        for(int row = 0; row<9; row++){
            for(int col = 0; col<9; col++){
                int val = board[row][col];
                if(val == '.'){
                    continue;
                }

                String rowKey = "row" + row  +"-"+ val;
                String colKey = "col" + col  +"-"+ val;
                String boxKey = "box" + (row/3)+ (col/3) + "-" +val;

                if(!seen.add(rowKey) ||
                   !seen.add(colKey) ||
                   !seen.add(boxKey)){
                    return false;
                }
            }
        }
        return true;
        
    }
}
