package Recursion;

public class RecursiveArray {
    public static void main(String[] args) {
        int [] arr={1,2,2,3,4,5};

        print(arr,0);
    }
    public static void print(int []arr,int idx)
    {
        if(idx>=arr.length) return;
        System.out.println(arr[idx]);
        print(arr,idx+1);
    }
}
