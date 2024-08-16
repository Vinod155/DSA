package Backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(count(3,3));

        System.out.println(pathDiagonal(3,3,""));
    }
    static int count(int r,int c)
    {
        if(r==1 || c==1) return 1;
        int left=count(r-1,c);
        int right=count(r,c-1);

         return left+right;

    }

    static void  path(int r,int c,String out)
    {
        if(r==1 && c==1)
        {
            System.out.println(out);
            return;
        }
        if(r>1)
        {
            path(r-1,c,out+"D");
        }
        if(c>1)
        {
            path(r,c-1,out+"R");
        }

    }

    static ArrayList<String> pathDiagonal(int r, int c, String out)
    {
        if(r==1 && c==1)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(out);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();

        if(r>1)
        {
            list.addAll(pathDiagonal(r-1,c,out+"D"));
        }
        if(c>1)
        {
            list.addAll(pathDiagonal(r,c-1,out+"R"));
        }
        if(r>1 && c>1)
        {
            list.addAll(pathDiagonal(r-1,c-1,out+"*"));

        }

        return list;
    }
}
