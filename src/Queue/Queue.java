package Queue;

public class Queue {
    public static void main(String[] args) {
        QueueUsingLL q=new QueueUsingLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.print();

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("*********");
        q.print();
    }
}
