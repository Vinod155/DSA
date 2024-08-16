package MultiThreading.AtomicVariable;

public class Main {

    public static void main(String[] args) {
        Resource r1=new Resource();
        Thread t1=new Thread(()->{
            for(int i=0;i<10;i++)
            {
                r1.increment();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<10;i++)
            {
                r1.increment();
            }
        });

        t1.start();
        t2.start();
        r1.display();
    }
}
