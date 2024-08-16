package Stack.Traversal;

import java.util.Stack;

public class EvaluationPostfix {
    public static void main(String[] args) {
       String s="2536+**5/2-";
        System.out.println(postfixEval(s));
    }

    public static int postfixEval(String s)
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(isOperator(s.charAt(i)))
            {
                int op1=st.pop();
                int op2=st.pop();
                st.push(operation(op2,op1,s.charAt(i)));
            }
            else{
                st.push(s.charAt(i)-'0');
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

    public static  int operation(int op2,int op1,char c)
    {
        return switch (c) {
            case '^' -> op2 ^ op1;
            case '*' -> op2 * op1;
            case '/' -> op2 / op1;
            case '+' -> op2 + op1;
            default -> op2 - op1;
        };
    }
}
