//==>8 Word Search

class Solution {
    public boolean exist(char[][] board, String word) {
        int n=0;
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            
            if(board[i][j] == word.charAt(n)){
                if(search(i,j,board,word,0)==true) return true;    
            }
        }
    }
    return false;
    
}

public boolean search(int i,int j,char[][] board,String word,int n){
  
    if(n == word.length()) return true;
    if(i<0 || j<0 || i == board.length || j== board[0].length || board[i][j] != word.charAt(n)) return false;
    
    char ch = board[i][j];
    board[i][j] = '.';
    
    boolean op1 = search(i,j+1,board,word,n+1);
    boolean op2 = search(i+1,j,board,word,n+1);
    boolean op3 = search(i,j-1,board,word,n+1);
    boolean op4 = search(i-1,j,board,word,n+1);
    
    board[i][j]=ch;
    
    return op1 || op2 || op3 || op4;
}
}
    
//==>Time complexity o(n2)
//==>space complexity o(1)
