package MultiThreading.ProducerConsumerProblem;

import java.util.LinkedList;

public class SharedResource extends Thread {

    private LinkedList<Integer> q;
    private int bufferSize;

    SharedResource(int bufferSize)
    {
        q=new LinkedList<>();
        this.bufferSize=bufferSize;
    }

    public synchronized void Producer(int item)
    {
        try{
            while(q.size()==this.bufferSize)
            {
                System.out.println("queue is full");
                wait();
            }

            q.add(item);
            System.out.println("addd item");
            notifyAll();

        }
        catch (Exception e)
        {

        }
    }

    public synchronized void Consumer()
    {
        try{
            while(q.isEmpty())
            {
                System.out.println("list is empty");
                wait();
            }
            System.out.println("Consumed item:"+q.poll());
            notify();
        }catch (Exception e)
        {

        }
    }
}
