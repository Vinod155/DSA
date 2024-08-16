package Recursion;

public class Frogjump {
    static int minJump=Integer.MAX_VALUE;
    static int final_res=Integer.MAX_VALUE;
    public static void main(String[] args) {
        int [] arr={10,30,40,50,20};
       //jump(arr,0,0);
        System.out.println(jump2(arr,0,3));
    }

    public static void jump(int[] arr,int idx,int output)
    {
        if(idx==arr.length-1)
        {
            minJump= Math.min(output, minJump);
            return;
        }

        jump(arr,idx+1,output+Math.abs(arr[idx+1]-arr[idx]));
        if(idx<arr.length-2)
        {
            jump(arr,idx+2,output+Math.abs(arr[idx+2]-arr[idx]));
        }
    }

    public static int jump1(int[] arr,int idx,int n)
    {
        if(idx==n-1) return 0;
        if(idx>n) return Integer.MAX_VALUE;
        int min_1=Math.abs(arr[idx]-arr[idx+1])+jump1(arr,idx+1,arr.length);
        int min_2=Integer.MAX_VALUE;
        if(idx<n-2) {

             min_2 = Math.abs(arr[idx] - arr[idx + 2]) + jump1(arr, idx + 2, arr.length);
        }

        return Math.min(min_1,min_2);

    }

    //frog jumps upto k

    public static int jump2(int[] arr,int idx,int k) {
         if(idx==arr.length-1) return 0;


        for(int i=1;i<=k;i++) {
            if(idx+i<arr.length) {
                final_res= Math.min(final_res, Math.abs(arr[idx] - arr[idx + i]) + jump2(arr,idx + i, k));
            }
        }
        return final_res;
    }
    }

