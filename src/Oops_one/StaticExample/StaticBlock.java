package Oops_one.StaticExample;

public class StaticBlock {
    static  int a=4;
    static int b;

    static{
        //static block
        b=a*10;
    }

    public static void main(String[] args) {
          StaticBlock st=new StaticBlock();
        System.out.println(StaticBlock.a+"  "+StaticBlock.b);
        StaticBlock.b+=3;
        StaticBlock st1=new StaticBlock();
        System.out.println(StaticBlock.a+"  "+StaticBlock.b);
    }
}
