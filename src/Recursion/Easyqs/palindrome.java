package Recursion.Easyqs;

public class palindrome {
    public static void main(String[] args) {
        int n=12321;
        int rev=fun(n,0);
        if(n==rev)
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
    public static int fun(int n,int output)
    {
        if(n<=0) return output;
        return fun(n/10,output*10+n%10);
    }
}
