package Oops_two;

public class BoxWeight extends Box{
    double weight;
    BoxWeight()
    {
        this.weight=-1;
    }

    BoxWeight(double l,double h,double w,double weight)
    {
        super(l,h,w);
        System.out.println(super.h); //this.h //accessing the h from parent class
        this.weight=weight;
    }
}
