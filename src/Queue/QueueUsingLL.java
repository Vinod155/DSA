package Queue;

public class QueueUsingLL {
     class Node
    {
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    Node head;
     Node tail;
    public void print()
    {
        Node temp=this.head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("************************");
    }

    //push-->AddAtBeg
    public void enqueue(int data)
    {
        Node n=new Node(data);
        if(this.head==null)
        {
            this.head=n;
            this.tail=head;
            return;
        }
        this.tail.next=n;
        this.tail=this.tail.next;
    }

    //pop-->remove first
    public int dequeue()
    {
        if(this.head==null) return -1;
        int val=this.head.data;
        this.head=this.head.next;
        return val;
    }
}
