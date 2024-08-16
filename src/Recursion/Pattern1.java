package Recursion;

public class Pattern1 {
    public static void main(String[] args) {
        pattern2(0,0,4);
    }
    public static void patternPrint(int n)
    {
        if(n==0) return;
        System.out.print("*");
        patternPrint(n-1);
    }
    public static void pattern(int n,int totalStar)
    {
        if(n==0) return;
        patternPrint(totalStar);
        System.out.println();
        pattern(n-1,totalStar);
    }

    //using only one recursive call

    public static void pattern2(int row,int col,int n)
    {
        if(row>=n) return;
        if(col==n)
        {
            System.out.println();
            pattern2(row+1,0,n);
            return;

        }
        System.out.print("*");
        pattern2(row,col+1,n);
    }
}
