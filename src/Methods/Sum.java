package Methods;

public class Sum {
    public static void main(String[] args) {
        Sum1();
        int ans=Sum2();
        int ans1=sum3(3,4);
        int ans2=sum3(5,5);

        System.out.println(ans1);
    }

    static void Sum1()
    {
        System.out.println("Hello world");
    }

    static int Sum2()
    {
        return 30+40;
    }
    static int sum3(int a ,int b)
    {
        return a+b;
    }
}
