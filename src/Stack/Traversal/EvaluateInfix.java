package Stack.Traversal;

import java.util.Stack;

public class EvaluateInfix {
    public static void main(String[] args) {
        System.out.println(evalInfix("2*(5*(3+6))/5-2"));
    }

    public static int evalInfix(String s)
    {
        Stack<Character> st=new Stack<>();
        Stack<Integer> st1=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(isOperator(s.charAt(i)))
            {
                if(st.empty())
            {
                st.push(s.charAt(i));
            }
              else if(s.charAt(i)=='('){
                  st.push(s.charAt(i));
              }
              else if(s.charAt(i)==')')
              {
                  while(!st.empty() && st.peek()!='(')
                  {
                      int op1=st1.pop();
                      int op2=st1.pop();
                      st1.push(operation(op2,op1,st.pop()));
                  }
                  st.pop();
              }
              else
              {
                  while(!st.empty() && precedence(s.charAt(i))<=precedence(st.peek()))
                  {
                      int op1=st1.pop();
                      int op2=st1.pop();
                      st1.push(operation(op2,op1,st.pop()));
                  }
                  st.push(s.charAt(i));
              }
            }
            else{
                st1.push(s.charAt(i)-'0');
            }
        }
        while(!st.empty())
        {
            int op1=st1.pop();
            int op2=st1.pop();
            st1.push(operation(op2,op1,st.pop()));
        }

        return st1.pop();
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

    public static  boolean isOperator(char c)
    {
        if(c=='^' || c=='*'|| c=='/'|| c=='+'|| c=='-' || c=='('|| c==')')
        {
            return true;
        }
        else{
            return false;
        }
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
