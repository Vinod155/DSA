package Sorting.MergeSort;

public class inversionPair {
    public static int count=0;
    public static void inversion(int[] arr,int start,int end)
    {
        if(start==end)
        {
            return;
        };
        int mid=start+(end-start)/2;
        inversion(arr,start,mid);
        inversion(arr,mid+1,end);;
        countInversion(arr,start,mid,end);
    }

    public static void countInversion(int[] arr,int start,int mid,int end)
    {
        int[] arr1=new int[mid-start+1];
        int[] arr2=new int[end-mid];
        int k=0;
        int pt1=0;
        int pt2=0;
        for(int i=start;i<=mid;i++)
        {
            arr1[k++]=arr[i];
        }
         k=0;
        for(int i=mid+1;i<=end;i++)
        {
            arr2[k++]=arr[i];
        }
        int idx=start;
        while(pt1<arr1.length && pt2<arr2.length)
        {
            if(arr1[pt1]<=arr2[pt2])
            {
                arr[idx++]=arr1[pt1++];
            }
            else {
                arr[idx++] = arr2[pt2];
                count += arr1.length-pt1;
                pt2++;
            }
        }
        while(pt1<arr1.length)
        {
            arr[idx++]=arr1[pt1++];
        }
        while(pt2<arr2.length)
        {
            arr[idx++]=arr2[pt2++];
        }
    }

    public static void main(String[] args) {

        int[] arr={2,3,8,6,1};
        inversion(arr,0,arr.length-1);
        System.out.println(count);
    }

}
