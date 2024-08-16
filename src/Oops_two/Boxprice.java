package Oops_two;

public class Boxprice extends BoxWeight {
    double box_price;

    Boxprice()
    {
        this.box_price=-1;
    }

    Boxprice(double l,double h,double w,double weight,double box_price)
    {
        super(l,h,w,weight);
        this.box_price=box_price;
    }
}
