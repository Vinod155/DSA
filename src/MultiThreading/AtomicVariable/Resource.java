package MultiThreading.AtomicVariable;

import java.util.concurrent.atomic.AtomicInteger;

public class Resource {
    int counter=0;

    public void increment()
    {
        counter++;
    }

    public void display()
    {
        System.out.println(counter);
    }
}
