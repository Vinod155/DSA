package Sorting.BubbleSort;

public class BubbleSort {
    public  static void bubbleSort(int[] arr)
    {

        for(int i=0;i<arr.length-1;i++)
        {
            boolean swap=false;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bubbleSort(arr);
        for(int item:arr)
        {
            System.out.println(item);
        }
    }
}
