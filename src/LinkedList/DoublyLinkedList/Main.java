package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLL ll=new DoublyLL();
        ll.addAtBeg(30);
        ll.addAtBeg(20);
        ll.addAtBeg(10);
        //ll.Display();
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);
        //ll.Display();

        ll.insertAtIdx(60,6);
        ll.Display();

        ll.removeAtIdx(4);
        ll.Display();

    }
}
