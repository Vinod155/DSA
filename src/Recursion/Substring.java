package Recursion;

public class Substring {
    public static void main(String[] args) {
       Substring("abc",0,"");
    }

    public static void Substring(String str,int idx,String output)
    {
        if(idx==str.length())
        {
            System.out.println(output);
            return;
        }
        Substring(str,idx+1,output+str.charAt(idx));
        Substring(str,idx+1,output);

    }
}
