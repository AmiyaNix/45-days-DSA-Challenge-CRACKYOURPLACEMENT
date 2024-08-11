class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int column = board[0].length;
        int index = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(word.charAt(index)==board[i][j] && searchNext(board, word, index, i, j)){
                    return true;
                }
            }
        }
        return false;
        
    }
    public static boolean searchNext(char[][] board, String word, int index , int i, int j){
        if(word.length() == index ){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[i].length || board[i][j]!=word.charAt(index) || word.charAt(index)=='!'){
            return false;
        }
        char c = board[i][j];
        board[i][j] = '!';

        if(searchNext(board, word, index+1, i-1, j) || 
        searchNext(board, word, index+1, i+1, j) || 
        searchNext(board, word, index+1, i, j-1) ||
        searchNext(board, word, index+1, i, j+1)){
            return true;
        }
        board[i][j] = c;
        return false;
    }
}
