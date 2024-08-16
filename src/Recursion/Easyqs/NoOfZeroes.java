package Recursion.Easyqs;

public class NoOfZeroes {
    public static void main(String[] args) {
        System.out.println(fun(512,0));
    }
    public static int fun(int n,int count)
    {
        if(n<=0) return count;
        if(n%10==0) return fun(n/10,count+1);
        return fun(n/10,count);
    }
}
