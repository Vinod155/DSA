package Sorting.InsertionSort;

public class Insertion {
    public static void selection(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr_element=arr[i];
            int  j=i-1;
             while(j>=0 && arr[j]>curr_element  )
                {
                    arr[j+1]=arr[j];
                    j--;
                }
            arr[j+1]=curr_element;

        }
    }

    public static void main(String[] args) {
        int [] arr={8,5,3,2,1,4,6,7};
        selection(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
