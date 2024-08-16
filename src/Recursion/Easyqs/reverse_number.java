package Recursion.Easyqs;

public class reverse_number {
    public static void main(String[] args) {
        System.out.println(fun(5678,0));
    }
    public static int fun(int n,int output)
    {
        if(n<=0) return output;
        return fun(n/10,output*10+n%10);
    }
}
