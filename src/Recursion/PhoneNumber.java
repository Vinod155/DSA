package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
    public static String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> result=new ArrayList<String>();

    public static void main(String[] args) {
        String digits="23";
        result.clear();
        if(digits.length()==0) return ;
        f(digits,0,"");
    }
    public static void f(String str,int idx,String output)
    {
        if(idx==str.length())
        {
            System.out.println(output);
            return;
        }
        int digit=str.charAt(idx)-'0';
        for(int k=0;k<map[digit].length();k++)
        {
            f(str,idx+1,output+map[digit].charAt(k));
        }
    }
}
