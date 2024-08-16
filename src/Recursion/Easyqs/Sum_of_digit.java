package Recursion.Easyqs;

public class Sum_of_digit {
    public static void main(String[] args) {
        System.out.println(fun(5676));
    }

    public static int fun(int n)
    {
        if(n<=0) return 0;

        return n%10+fun(n/10);
    }
}
