package Oops_one;

public class InnerClasses {

    static class Test{
        String name;
      Test(String name)
      {
          this.name=name;
      }
    }

    public static void main(String[] args) {
        Test a=new Test("vin");
        Test b=new Test("vin2");

    }
}
