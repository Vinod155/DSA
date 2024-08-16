package MultiThreading;

public class MonitorLockExample {

    public synchronized  void task1()
    {
        try
        {
            System.out.println("Inside task 1");
            Thread.sleep(10000);
            System.out.println("task 1 completed");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void task2()
    {
        System.out.println("in task 2 but before synchronized");
        synchronized (this)
        {
            System.out.println("inside task 2 but after synchronized");
        }
    }

    public void task3()
    {
        System.out.println("inside task 3");
    }
}
