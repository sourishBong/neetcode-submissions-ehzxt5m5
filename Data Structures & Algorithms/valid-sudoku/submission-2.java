class Solution {

    public boolean isValidSudoku(char[][] board) {
        
        //Check with Set
        Set<String> set=new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

                if(board[i][j]=='.')
                    continue;

                String row=String.valueOf(board[i][j])+"_ROW_"+String.valueOf(i);
                String col=String.valueOf(board[i][j])+"_COL_"+String.valueOf(j);
                String box=String.valueOf(board[i][j])+"_BOX_"+String.valueOf(i/3)+"_"+String.valueOf(j/3);

                if(set.contains(row) || set.contains(col) || set.contains(box))
                    return false;
                
                set.add(row);
                set.add(col);
                set.add(box);
            }
        }

        return true;
    }
}
