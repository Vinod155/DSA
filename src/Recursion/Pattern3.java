package Recursion;

public class Pattern3 {
    public static void main(String[] args) {
       pattern(0,0,5);
    }
    public static void pattern(int row,int col,int n)
    {
        if(row>=n) return;
        if(col>=n-row)
        {
            System.out.println();
            pattern(row+1,0,n);
            return;
        }
        System.out.print("*");
        pattern(row,col+1,n);


    }
}