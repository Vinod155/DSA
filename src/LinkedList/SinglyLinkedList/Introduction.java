package LinkedList.SinglyLinkedList;

public class Introduction {

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

    public void addLast(int data)
    {
        Node n=new Node(data);
        Node temp=this.head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;
    }

    public void addIndexAt(int data,int pos)
    {
        Node n=new Node(data);
        if(pos<0) return;
        if(pos==0)
        {
            n.next=this.head;
            this.head=n;
            return;
        }
        int i=1;
        Node temp=head;
        while(i<pos)
        {
            temp=temp.next;
            i++;
        }
        n.next=temp.next;
        temp.next=n;
    }

    public int removeFirst()
    {
        if(this.head==null) return -1;

        this.head=this.head.next;
        return 1;
    }

    public int removeLast()
    {
        if(this.head==null) return -1;
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
      return 1;
    }

    public int removeAtIdx(int idx)
    {
        if(this.head==null) return -1;

        if(idx<0) return -1;
        if(idx==0)
        {
            return removeFirst();
        }
        Node temp=head;
        int i=1;
        while(i<idx)
        {
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return 1;
    }

}
