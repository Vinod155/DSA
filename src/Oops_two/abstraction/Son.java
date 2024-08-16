package Oops_two.abstraction;

public  class Son  extends Parent{

    @Override
    void career(String name) {
        System.out.println("i am goint to be "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love "+name+" she is "+age);
    }
}
