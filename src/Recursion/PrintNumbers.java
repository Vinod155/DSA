package Recursion;

public class PrintNumbers {
    public static void main(String[] args) {
      print(5);
    }
    public static void print(int n)
    {
        if(n==0)
        {
            System.out.println("Ascending Order");
           return ;
        }
        //descending order
        System.out.println(n);
         print(n-1);
         //asending order
        System.out.println(n);

    }
;}
