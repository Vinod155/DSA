package Stack.Traversal;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String str="A+B-(C+D)+E*F^G";
        System.out.println(infixToPost(str));
    }

    public static  String infixToPost(String s)
    {
        Stack<Character> st=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {

            if((s.charAt(i)>='a' && s.charAt(i)<='z') ||(s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='0' && s.charAt(i)<='9'))
            {
                res.append(s.charAt(i));
            }
            else if(s.charAt(i)=='(')
                    {
                        st.push(s.charAt(i));
                    }
            else if(s.charAt(i)==')')
                    {
                        while(!st.isEmpty() && st.peek()!='(' ){
                            res.append(st.pop());
                        }
                        st.pop();
                    }
            else {
                        while (!st.isEmpty() && precedence(st.peek()) >= precedence(s.charAt(i))) {
                            res.append(st.pop());
                        }
                        st.push(s.charAt(i));
                    }
                }
        while(!st.empty())
        {
            res.append(st.pop());
        }
        return res.toString();
    }

    public static int precedence(char c)
    {
        if(c=='^')
        {
            return 2;
        }
        else if(c=='*' || c=='/')return 1;
        else if(c=='-' || c=='+'){
            return 0;
        }
        else{
            return -1;
        }
    }
}
