package Recursion;

public class Binary_search {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(binary(arr,5,0,arr.length-1));
    }

    public static  int binary(int[] arr,int target,int start,int end)
    {
        int mid=start+(end-start)/2;
        if(start>end) return -1;
        if(arr[mid]==target)  return mid;
        return arr[mid]<target?binary(arr,target,start+1,end):binary(arr,target,start,end-1);
    }
}
