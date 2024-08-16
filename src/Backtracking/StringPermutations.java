package Backtracking;

public class StringPermutations {
    public static void main(String[] args) {
        permutationBacktracking("abc",0,2);
    }

    static String swap(String str,int l,int r)
    {
         StringBuilder str1=new StringBuilder(str);
         char temp=str1.charAt(l);
         str1.setCharAt(l,str1.charAt(r));
        str1.setCharAt(r,temp);
        return str1.toString();

    }

    static void fun(String str,String output)
    {
        if(str.isEmpty())
        {
            System.out.println(output);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            fun(str.substring(0,i)+str.substring(i+1),output+str.charAt(i));

        }
    }
    static void permutationBacktracking(String str,int l,int r)
    {
        if(l==r)
        {
            System.out.println(str);
            return;
        }
        for (int i = l; i <str.length() ; i++) {
            str=swap(str,l,i);
            permutationBacktracking(str,l+1,r);
            str=swap(str,l,i);
        }
    }


}
