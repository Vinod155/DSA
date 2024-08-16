package Oops_two.polymorphism.methodOverloading;

public class overloading {
    double sum(double s,int b)
    {
        return s+b;
    }
    int sum(int a,int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        overloading obj=new overloading();
        System.out.println(obj.sum(2.0,3));
        System.out.println(obj.sum(2,3));


    }
}
