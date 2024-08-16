package Queue.Problems;

import java.util.LinkedList;
import java.util.Queue;

public class decimalValues {
    public static void main(String[] args) {
     binaryNo(7);
    }

    public static  void binaryNo(int n)
    {
        Queue<String> q=new LinkedList<>();
        q.add("1");
        while(n!=0)
        {
            String s1=q.remove();
            System.out.println(s1);

            q.add(s1+"0");
            q.add(s1+"1");
            n--;

        }
    }
}
