package Sorting.MergeSort;

public class mergingSortedArrays {
    public static void main(String[] args) {
        int[] arr1={1,5,7,10};
        int[] arr2={2,3,9,12,16};
        int[] arr=new int[arr1.length+arr2.length];
        int pt1=0;
        int pt2=0;
        int idx=0;
        while(pt1<arr1.length && pt2<arr2.length)
        {
            if(arr1[pt1]<arr2[pt2])
            {
                arr[idx]=arr1[pt1];
                idx++;
                pt1++;
            } else if (arr1[pt1]>arr2[pt2]) {
                arr[idx++]=arr2[pt2];
                pt2++;
            }
            else
            {
                arr[idx++]=arr1[pt1];
                arr[idx++]=arr2[pt2];
                pt1++;
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

        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
