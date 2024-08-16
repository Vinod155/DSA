package Backtracking;

public class RatMaze {
    public static void main(String[] args) {
        boolean [][] maze={{true,true,false,false}
                ,{false,true,true,true},{false,true,false,false},{false,true,true,true}};
        boolean [][] mark=new boolean[maze.length][maze.length];
        System.out.println(backtrack(maze,0,0,mark));
    }

    static boolean backtrack(boolean[][] maze,int row,int col,boolean[][] mark)
    {
        if(row==maze.length-1 && col==maze.length-1)
        {
            if(maze[row][col]) {
                mark[row][col]=true;
                display(mark);
                return true;
            }
            return false;

        }
        if(row<0 || row== maze.length || col<0 || col== maze.length || !maze[row][col])
            return false;
        mark[row][col]=true;


                if(backtrack(maze,row,col+1,mark)|| backtrack(maze,row+1,col,mark)) {

                    return true;
                }
                mark[row][col]=false;


        return false;
    }
    static void display(boolean[][] mark)
    {
        for(boolean[] num:mark)
        {
            for(boolean col:num)
            {
                if(col)
                {
                    System.out.print("1");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
