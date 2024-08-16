package LinkedList.DoublyLinkedList;

public class removeDuplicates {
    public static void main(String[] args) {
        DoublyLL ll=new DoublyLL();
        ll.insertAtEnd(1);
        ll.insertAtEnd(1);
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(2);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(5);
        ll.Display();

        DoublyLL.Node prev=ll.head;
        DoublyLL.Node curr=ll.head.next;

        while(curr!=null)
        {
            if(prev.data==curr.data)
            {
                if(curr.prev!=null && curr.next!=null)
                {
                    curr.next.prev=prev;
                }
                curr=curr.next;
                prev.next=curr;
            }
            else {
                prev=curr;
                curr=curr.next;
            }
        }

        ll.Display();

    }
}
