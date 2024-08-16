package MultiThreading.RentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Producer {
    boolean isAvailable=false;


    public  void produce(ReentrantLock lock) {
        try {
            lock.lock();
            isAvailable = true;
            System.out.println("Lock acquired by: "+Thread.currentThread().getName());
            Thread.sleep(3000);
        } catch (Exception e) {
            //
        }
        finally {
            lock.unlock();
            System.out.println("Lock released by: "+Thread.currentThread().getName());

        }
    }
}
