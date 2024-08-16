package Recursion.pattern;

public class pattern1 {
    public static void main(String[] args) {
        fun(6,0,0);
    }

    static void fun(int n,int row,int col)
    {
        if(row==n) {

            return;
        }
        if(col==n-row)
        {
             fun(n,row+1,0);
            System.out.println();

             return;
        }
        fun(n,row,col+1);
        System.out.print("*");

    }
}
