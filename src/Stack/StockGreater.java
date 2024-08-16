package Stack;

import java.util.Stack;

public class StockGreater {

    public static int[] greater(int[] arr)
    {
        int [] output=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            while(!st.empty() && arr[st.peek()]<arr[i])
                {
                    count+=output[st.pop()];

                }
            output[i]=count;
            st.push(i);

        }
        return output;
    }

    public static void main(String[] args) {
         int[] arr={100,80,60,70,60,75,85};
         int[] res=greater(arr);

         for(int el:res)
         {
             System.out.println(el);
         }
    }
}
