package LinkedList.DoublyLinkedList;

public class FindPair {
    public  static void findPair(DoublyLL.Node head, DoublyLL.Node head1,int x)
    {

        while(head!=head1)
        {
            int sum=head.data+ head1.data;
            if(sum>x)
            {
                head1=head1.prev;
            }
            else if(sum<x)
            {
                head=head.next;
            }
            else {
                System.out.println(head.data+","+ head1.data);
                head=head.next;
                head1=head1.next;
            }
        }

    }

    public static void main(String[] args) {
        DoublyLL ll=new DoublyLL();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(9);
        ll.Display();
        int x=7;
        DoublyLL.Node temp=ll.head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
      findPair(ll.head,temp,x);
    }
}
