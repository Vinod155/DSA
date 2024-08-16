package Oops_two.package_2;

import Oops_two.package_1.Class1;

public class Class2 extends Class1 {

    public Class2(int num, int num1, int num2) {
        super(num, num1, num2);
    }

    public static void main(String[] args) {
        Class2 obj2=new Class2(1,2,3);
        System.out.println(obj2);
    }
}
