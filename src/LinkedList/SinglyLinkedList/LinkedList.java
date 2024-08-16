package LinkedList.SinglyLinkedList;

public class LinkedList {
    public static void main(String[] args) {
        Introduction ll=new Introduction();
        ll.addFirst(50);
        ll.addFirst(40);

        ll.addLast(100);
        ll.addLast(101);
        ll.addIndexAt(200,0);
        ll.print();
        System.out.println("*************************************");
        ll.removeAtIdx(2);
        ll.print();
    }
}
