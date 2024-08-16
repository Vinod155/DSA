package Array;

public final class classA  extends classB{
    public void methodA()
    {
        System.out.println("in method 1 class a");
    }

    @Override
    public void methodB() {
        super.methodB();
        System.out.println("in class A");
    }

    public static void main(String[] args) {

    }
}
