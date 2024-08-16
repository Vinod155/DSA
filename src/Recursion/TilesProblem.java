package Recursion;

public class TilesProblem {
    public static void main(String[] args) {
        System.out.println(Tile(4));
    }

    public static  int Tile(int n)
    {
        if(n==0 || n==1 ||  n==2) return n;
        if(n==3) return 2;
        return (Tile(n-1)+Tile(n-2));
    }
}
