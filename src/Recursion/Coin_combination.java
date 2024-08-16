package Recursion;

public class Coin_combination {
    static int count=Integer.MAX_VALUE;
    static int min=Integer.MAX_VALUE;

    public static void main(String[] args) {
   int [] arr={1,2,3};
   f(arr,4,0,0,0);
        //System.out.println(f1(arr,2));
    }

    public static  void f(int [] arr,int x,int idx,int output,int count_1)
    {
        if(output==x)
        {
            count= Math.min(count, count_1);
            return;
        }
        if(output>x || idx>arr.length) return;
        f(arr,x,idx,output+arr[idx],count_1+1);
        if(idx+1<arr.length)
        {
            f(arr,x,idx+1,output+arr[idx],count_1+1);
        }
    }

//    public static  int f1(int [] arr,int x)
//    {
//        if(x==0) return 0;
//        if(x<0) return Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++)
//        {
//
//            min= 1+Math.min(f1(arr,x-arr[i]));
//        }
//        return min;
//    }
}
