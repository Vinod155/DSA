package Recursion;

public class Remove_x {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("abcdexxfxxgh");
        String str1=str.toString();
        String output="";
        RemoveX(str1,0,output);
        //Remove(str,0);
    }

    public static  void Remove(StringBuilder str,int idx)
    {
        if(idx>=str.length()) return;
        if(str.charAt(idx)=='x')
        {
            str.deleteCharAt(idx);
            Remove(str,idx);
            return;
        }
        Remove(str,idx+1);
    }

    public static  void RemoveX(String str,int idx,String output)
    {
        if(idx>=str.length()) {
            System.out.println(output);
            return;
        }
        if(str.charAt(idx)!='x')
        {
            RemoveX(str,idx+1,output+str.charAt(idx));
        }
        else {
            RemoveX(str,idx+1,output);
        }
    }
}
