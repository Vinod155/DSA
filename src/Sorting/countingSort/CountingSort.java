package Sorting.countingSort;

public class CountingSort {

    public static  int[] countSort(int [] arr)
    {
        int[] res=new int[arr.length];
        int min=minMax(arr,false);
        int max=minMax(arr,true);
        int size =max-min;
        int[] freq=new int[size+1];
        for(int i=0;i<arr.length;i++)
        {
            int newIdx=arr[i]-min;
            freq[newIdx]++;
        }
        for(int i=1;i<=size;i++)
        {
            freq[i]=freq[i-1]+freq[i];
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            res[freq[arr[i]-min]-1]=arr[i];
            freq[arr[i]-min]--;
        }
        return res;
    }

    public static int minMax(int[]arr,boolean max)
    {
        if(max)
        {
            int maxEl=Integer.MIN_VALUE;
            for(int i: arr)
            {
                if(maxEl<i)
                {
                    maxEl=i;
                }
            }
            return maxEl;
        }
        //getting min element
        else {
            int minValue=Integer.MAX_VALUE;
            for(int i: arr)
            {
                if(minValue>i)
                {
                    minValue=i;
                }
            }
            return minValue;
        }
    }

    public static void main(String[] args) {
       int[] arr={3,2,1,4,5,8,6,4,2,-3,-2,-2,-1};
       int[]res=countSort(arr);
       for(int i:res)
       {
           System.out.println(i);
       }
    }
}
