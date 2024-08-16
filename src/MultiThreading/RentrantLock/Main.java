package MultiThreading.RentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        ReentrantLock lock=new ReentrantLock();
        Producer p1=new Producer();
        Producer p2=new Producer();

        Thread t1= new Thread(()->{
            p1.produce(lock);
        });
        Thread t2= new Thread(()->{
            p2.produce(lock);
        });
        t1.start();
        t2.start();
    }
}
