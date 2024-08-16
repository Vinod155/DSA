package MultiThreading;

public class LearningThreads implements  Runnable{
    @Override
    public void run() {
        System.out.println("Thread name is "+Thread.currentThread().getName());
    }
}
