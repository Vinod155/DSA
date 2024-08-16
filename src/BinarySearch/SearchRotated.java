package BinarySearch;

import java.util.Arrays;

public class SearchRotated {

    public static int findPeak(int[] arr,int l,int r)
    {
        int lastEl=arr[arr.length-1];
        if(arr.length==1)
        {
            return 0;
        }
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if( mid<=r-1 && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]<=lastEl)
            {
                r=mid-1;
            }
            else if(arr[mid]>lastEl)
            {
                l=mid+1;
            }
        }
        return r;
    }

   public static int search(int[] arr,int l,int r,int target)
 {
     int peak=findPeak(arr,l,r);
     int lastEl=arr[r];
     if(arr.length==1)
     {
         return Binary(arr,l,r,target);
     }
     if(target<=lastEl)
     {
         l=peak+1;
         return Binary(arr,l,r,target);
     }
     else {
         r=peak;
         return Binary(arr,l,r,target);
     }
}
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
        int[] arr={1,3};
        System.out.println(search(arr,0,arr.length-1,2));

    }
}
