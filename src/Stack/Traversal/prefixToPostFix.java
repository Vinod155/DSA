package Stack.Traversal;

import java.util.Stack;

public class prefixToPostFix {
    public static void main(String[] args) {
        System.out.println(prefixToPost("*+AB-CD"));
    }

    public static String prefixToPost(String s)
    {
        StringBuilder str=new StringBuilder(s);
        s=str.reverse().toString();
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(isOperator(s.charAt(i)))
            {
                int j=0;
                String temp="";
                while(!st.empty() && j<2)
                {
                    temp+=st.pop();
                    j++;
                }
                temp+=s.charAt(i);
                st.push(temp);
            }
            else{
               st.push(Character.toString(s.charAt(i)));
            }
        }

        return st.pop();
    }

    public static  boolean isOperator(char c)
    {
        if(c=='^' || c=='*'|| c=='/'|| c=='+'|| c=='-')
        {
            return true;
        }
        else{
            return false;
        }
    }



}
