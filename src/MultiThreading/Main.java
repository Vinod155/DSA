package MultiThreading;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Going inside thread "+Thread.currentThread().getName());
//        LearningThreads runnableObj=new LearningThreads();
//        Thread thread=new Thread(runnableObj);
//        thread.start();
//        System.out.println("Thread End");

        MonitorLockExample obj=new MonitorLockExample();
        Thread t1=new Thread(()->{obj.task1();});
        Thread t2=new Thread(()->{obj.task2();});
        Thread t3=new Thread(()->{obj.task3();});

        t1.start();
        t2.start();
        t3.start();


    }
}