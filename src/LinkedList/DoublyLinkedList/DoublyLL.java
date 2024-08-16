package LinkedList.DoublyLinkedList;

public class DoublyLL {
     class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data=data;
        }
    }
    Node head;

    public void Display()
    {
        Node temp=this.head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("******************************");
    }

    public void addAtBeg(int data)
    {
        Node nn=new Node(data);
        if(this.head==null)
        {
            this.head=nn;
            return;
        }
        nn.next=head;
        head.prev=nn;
        head=nn;
    }

public void insertAtEnd(int data)
{
    if(this.head==null)
    {
        addAtBeg(data);
        return;
    }
    Node nn=new Node(data);
    Node temp=this.head;

    while(temp.next!=null)
    {
        temp=temp.next;
    }
    temp.next=nn;
    nn.prev=temp;
}

public void insertAtIdx(int data ,int idx)
{
    if(this.head==null || idx==0)
    {
        addAtBeg(data);
        return;
    }
    Node nn=new Node(data);
    int i=1;
    Node temp=this.head;
    while(i<idx-1 && temp.next!=null)
    {
        temp=temp.next;
        i++;
    }
    if(temp.next==null)
    {
        insertAtEnd(data);
        return;
    }
    nn.next=temp.next;
    temp.next.prev=nn;
    temp.next=nn;
    nn.prev=temp;


}
//deletion operation

    public void removeAtBeg()
    {
        if(head==null)return;
        this.head=this.head.next;
        this.head.prev=null;
    }

    public void removeAtEnd()
    {
        if(this.head==null) return;
        Node temp=this.head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }

    public void removeAtIdx(int idx)
    {
        if(this.head==null)return;
        // 1 based indexing not 0
        if(idx==1)
        {
            removeAtBeg();
            return;
        }
        Node temp=this.head;
        int i=1;
        while(i<idx-1 && temp.next.next!=null)
        {
            temp=temp.next;
            i++;
        }
        if(temp.next.next==null)
        {
            removeAtEnd();
            System.out.println("in");
            return;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
    }

}
