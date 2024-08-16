package MultiThreading.ProducerConsumerProblem;

public class Main {
    public static void main(String[] args) {

        SharedResource res=new SharedResource(3);
        Thread producer=new Thread(()->{
            for (int i = 0; i <6 ; i++) {
                res.Producer(i);
            }
        });
        Thread consumer=new Thread(()->{
            for (int i = 0; i <6 ; i++) {
                res.Consumer();
            }
        });

        producer.start();
        consumer.start();
    }
}
