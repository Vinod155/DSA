package Recursion;

public class StringDecode {
    public static void main(String[] args) {
        Decode("201014",0,"");
    }

    public static  void Decode(String str,int idx,String output)
    {
        if(idx==str.length())
        {
            System.out.println(output);
            return;
        }
        if(str.charAt(idx)=='0') return;
        int temp=str.charAt(idx)-'0';
        Decode(str,idx+1,output+temp+" ");
        if(idx<str.length()-1) {

            int temp1 = (str.charAt(idx)  - '0')*10+str.charAt(idx+1)-'0';
            if (temp1 <= 26) {
                Decode(str, idx + 2, output + temp1+" ");
            }
        }
    }
}
