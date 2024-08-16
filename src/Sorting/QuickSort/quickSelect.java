package Sorting.QuickSort;

public class quickSelect {
    public static int partition(int[] arr,int l,int r,int idx )
    {
        int pivot=arr[idx];
        //swapping pivot with last element
        arr[idx]=arr[r];
        arr[r]=pivot;
        int pt1=l,i=l;
        while(i<r)
        {
            if(arr[i]<pivot)
            {
                int temp=arr[pt1];
                arr[pt1]=arr[i];
                arr[i]=temp;
                i++;
                pt1++;
            }
            else {
                i++;
            }
        }
        int temp=arr[pt1];
        arr[pt1]=pivot;
        arr[r]=temp;
        return pt1;
    }

    public static int getRandom(int l,int r) {
        return((int)(Math.random()*(r-l))+l);
    }

    public static  int quickSelect(int[] arr,int l,int r,int k)
    {
        int pivot=getRandom(l,r);
        int x=partition(arr,l,r,pivot);
        if(x==k)
        {
            return arr[k];
        }
        if(k<x)
        {
            return quickSelect(arr,l,x-1,k);
        }
        else {
            return quickSelect(arr,x+1,r,k);
        }
    }

    public static void main(String[] args) {
        int[] arr={2,3,6,1,8};
        int k=2;
        System.out.println(quickSelect(arr,0,arr.length-1,k-1));


    }
}
