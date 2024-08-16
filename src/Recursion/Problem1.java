// calculate a^b
package Recursion;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(power(3,3));
    }
    public static int power(int a,int b)
    {
        if(a<=1 || b==0)
        {
            return 1;
        }
        return a*power(a,b-1);
    }
}
