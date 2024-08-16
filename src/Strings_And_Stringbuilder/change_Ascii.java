package Strings_And_Stringbuilder;

public class change_Ascii {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("cdEfG");

        for(int i=0;i<str.length();i++)
        {
            int temp=str.charAt(i);
            if(i%2==0)
            {
                temp=temp+1;
                if(str.charAt(i)=='z' || str.charAt(i)=='Z')
                {
                    char ch=str.charAt(i)=='z'?'a':'A';
                    str.setCharAt(i, ch);
                }
                else {
                    char ch = (char) temp;
                    str.setCharAt(i, ch);
                }
            }
            else
            {
                temp=temp-1;
                if(str.charAt(i)=='a' || str.charAt(i)=='A')
                {
                    char ch=str.charAt(i)=='a'?'z':'Z';
                    str.setCharAt(i, ch);
                }
                else {
                    char ch = (char) temp;
                    str.setCharAt(i, ch);
                }
            }

        }
        System.out.println(str);
    }
}
