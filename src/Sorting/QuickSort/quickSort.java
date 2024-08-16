package Sorting.QuickSort;

public class quickSort {
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

    public static  void quick(int[] arr,int l,int r)
    {
        if(l>r) return;
        int pivot=getRandom(l,r);
        int x=partition(arr,l,r,pivot);
        quick(arr,l,x-1);
        quick(arr,x+1,r);
    }

    public static void main(String[] args) {
        int[] arr={8,7,1,2,3,10,12,2,-1,22,33,11,15,-2};
        quick(arr,0,arr.length-1);

        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
