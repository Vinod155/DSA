package Sorting.MergeSort;

public class MergeSort {
    public static  void mergeSort(int[] arr,int start,int end)
    {
        if(start==end)return;
        int mid=start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);

    }

    public static  void merge(int[] arr,int start,int mid,int end)
    {
        int[]arr1=new int[end+1];
        int pt1=start;
        int pt2=mid+1;
        int idx=start;
        while(pt1<=mid && pt2<=end)
        {
            if(arr[pt1]<arr[pt2])
            {
                arr1[idx]=arr[pt1];
                idx++;
                pt1++;
            } else if (arr[pt1]>arr[pt2]) {
                arr1[idx++]=arr[pt2];
                pt2++;
            }
            else
            {
                arr1[idx++]=arr[pt1];
                arr1[idx++]=arr[pt2];
                pt1++;
                pt2++;
            }
        }
        while(pt1<=mid)
        {
            arr1[idx++]=arr[pt1++];
        }
        while(pt2<=end)
        {
            arr1[idx++]=arr[pt2++];
        }
        for(int i=start;i<=end;i++)
        {
            arr[i]=arr1[i];
        }
    }

    public static void main(String[] args) {
        int[] arr={8,10,6,19,4,3,11,1};
        mergeSort(arr,0,7);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
