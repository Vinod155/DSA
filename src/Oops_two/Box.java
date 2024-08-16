package Oops_two;

public class Box {
    double l;
    double h;
    double w;

    Box()
    {
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    //cube

    Box(double side)
    {
        this.l=side;
        this.w=side;
        this.h=side;
    }

    Box(double l,double h,double w)
    {
        this.l=l;
        this.w=w;
        this.h=h;
    }

    Box(Box old)
    {
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }

    public  void information()
    {
        System.out.println("running the box");
    }
}
