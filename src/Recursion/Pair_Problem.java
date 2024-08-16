package Recursion;

public class Pair_Problem {
    public static void main(String[] args) {
        System.out.println(CountPair(4));
    }

    public static int CountPair(int n)
    {
        if(n<=1)return 1;
        return (CountPair(n-1)+(n-1)*CountPair(n-2));
    }
}
