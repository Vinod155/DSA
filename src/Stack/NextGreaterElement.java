package Stack;

import java.util.Stack;

public class NextGreaterElement {

    public static void nextGreater(int[] arr)
    {
        Stack<Integer> st=new Stack<>();
        if(arr.length==0)
        {
            return;
        }

        int i=arr.length-1;
        while(i>=0)
        {
            if(!st.empty()&&arr[i]>st.peek())
            {
                if(!st.empty()) {
                    st.pop();
                }
            }
            else{
                int temp=arr[i];
                if(!st.empty()) {
                    arr[i] = st.peek();
                }else{
                    arr[i]=-1;
                }
                st.push(temp);
                i--;
            }
        }
    }

    public static void nextSmaller(int[] arr)
    {
        Stack<Integer> st=new Stack<>();
        if(arr.length==0)
        {
            return;
        }

        int i=arr.length-1;
        while(i>=0)
        {
            if(!st.empty()&&arr[i]<st.peek())
            {
                if(!st.empty()) {
                    st.pop();
                }
            }
            else{
                int temp=arr[i];
                if(!st.empty()) {
                    arr[i] = st.peek();
                }else{
                    arr[i]=-1;
                }
                st.push(temp);
                i--;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr={10,7,4,2,9,10,11,3,2};
        nextGreater(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }

        System.out.println("next smaller ::  ");
        int[] arr1={10,7,4,2,2,9,10,11,3,2};
         nextSmaller(arr1);
        for(int i:arr1)
        {
            System.out.println(i);
        }
    }
}
