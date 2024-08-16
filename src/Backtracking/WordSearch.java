package Backtracking;

public class WordSearch {
     static char [][] board1;
    public static void main(String[] args) {
        char [][] board={{'A','B','C','D'},{'E','F','G','H'},{'E','E','S','E'}};
        board1=board;
        String word="ABFGHE";
        System.out.println(start(word));
        display(board);
    }
    static boolean start(String word)
    {
        for(int i=0;i<board1.length;i++)
        {
            for(int j=0;j<board1[0].length;j++)
            {
                if(backtrack(i,j, word,0))
                    return true;
            }
        }
        return false;
    }
    static boolean backtrack(int row,int col,String word,int index)
    {
        if(index>=word.length())
        {
            return true;
        }
        if(row<0 || row==board1.length || col<0 || col== board1[0].length || board1[row][col]!=word.charAt(index))
            return false;

        int [] rowSet={0,1,-1,0};
        int [] colSet={1,0,0,-1};
        board1[row][col]='#';
        for(int i=0;i<4;i++)
        {
            if(backtrack(row+rowSet[i],col+colSet[i],word,index+1))
                return true;
        }

        return false;
    }
    static void display(char [][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board1[i][j]=='#')
                {
                    System.out.print(board[i][j]+" ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
