package Stack;

public class stack {
    public static void main(String[] args) {
        StackUsingLinkedList st=new StackUsingLinkedList();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.print();

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

        st.print();
    }
}
