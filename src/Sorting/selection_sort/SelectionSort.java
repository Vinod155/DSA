package Sorting.selection_sort;

public class SelectionSort {

    public static void Selection(int[] arr)
    {

        for(int i=0;i<arr.length;i++)
        {
            int temp=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[temp]>arr[j])
                {
                    temp=j;
                }
            }
            int val=arr[i];
            arr[i]=arr[temp];
            arr[temp]=val;
        }

    }
    public static void main(String[] args) {
       int[] arr={3,2,10,1,20};
       Selection(arr);
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }
    }
}
