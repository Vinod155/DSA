package BinarySearch;

public class binarySearch {
    public static  int Binary(int[] arr,int l,int r,int x)
    {
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]<x)
            {
                l=mid+1;
            }
            else if(arr[mid]>x)
            {
                r=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int idx=Binary(arr,0,arr.length-1,10);
        if(idx==-1)
        {
            System.out.println("elements is not present");
        }
        else {
            System.out.println(arr[idx]+" is present at : "+idx+" index");
        }

    }
}
