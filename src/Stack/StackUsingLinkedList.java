package Stack;


public class StackUsingLinkedList {
    class Node
    {
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    Node head;
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
    public void push(int data)
    {
        Node n=new Node(data);
        n.next=this.head;
        this.head=n;
    }

    //pop-->remove first
    public int pop()
    {
        if(this.head==null) return -1;
        int val=this.head.data;
        this.head=this.head.next;
        return val;
    }
}
