package Recursion.MediusmQs;

import java.util.ArrayList;

public class phoneNumberString {
    //static ArrayList<String> str=new ArrayList<>();
    static String[] str ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
          fun("234",0,"");
    }
    static void fun(String digits,int idx,String output)
    {
        if(idx==digits.length())
        {
            System.out.println(output);
            return;
        }
        int temp=digits.charAt(idx)-'0';
        for(int i=0;i<str[temp].length();i++)
        {
            fun(digits,idx+1,output+str[temp].charAt(i));
        }

    }
}
