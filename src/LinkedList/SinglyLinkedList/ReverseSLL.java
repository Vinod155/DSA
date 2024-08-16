package LinkedList.SinglyLinkedList;

public class ReverseSLL {
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
    }

    public void addFirst(int data)
    {
        Node n=new Node(data);
        n.next=this.head;
        this.head=n;
    }
    public  void Reverse()
    {
        if(this.head==null)return;
       Node c=head;
       Node n=head.next;
       Node temp=head.next;
       c.next=null;
       while(temp!=null)
       {
           temp=n.next;
           n.next=c;
           c=n;
           n=temp;
       }
       head=c;

    }

    public static void main(String[] args) {
        ReverseSLL ll=new ReverseSLL();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        System.out.println("*****************");
        ll.Reverse();
        ll.print();
    }
}
