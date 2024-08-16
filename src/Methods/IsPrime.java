package Methods;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        System.out.println(isArmstrong(n));
    }
    static boolean isArmstrong(int n)
    {
        int sum=0;
        int num=n;
        while(num>0)
        {
            int temp=num%10;
            sum+=temp*temp*temp;
            num=num/10;
        }
        return sum == n;
    }
}
