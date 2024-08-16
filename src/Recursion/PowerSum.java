package Recursion;

public class PowerSum {
    static int  count=0;
    public static void main(String[] args) {
       f(100,3,1);
        System.out.println(count);
    }
    public static void f(int x,int n,int i)
    {
       if(x==0) count++;
       if(Math.pow(i,n)>x) return;

       f(x-(int)(Math.pow(i,n)),n,i+1);
        f(x,n,i+1);


    }
}
