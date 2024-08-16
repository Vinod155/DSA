package Recursion;

import java.util.ArrayList;
import java.util.List;

public class ValidParanthesis {
    List<String> str= new ArrayList<>();
    public static void main(String[] args) {
        Paranthesis(4,0,0,"");
    }
    public static  void Paranthesis(int n,int st,int end,String output)
    {
        if(st==n && end==n)
        {
            System.out.println(output);
            return;
        }
        if(st==n)
        {
            Paranthesis(n,st,end+1,output+')');
            return;
        }
        if(st==end) {
            Paranthesis(n, st + 1, end, output + '(');
        }
        else if(st>end) {
            Paranthesis(n,st+1,end,output+'(');

            Paranthesis(n,st,end+1,output+')');
        }


    }

}
