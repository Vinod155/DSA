package Sorting;

public class kLargestElement {
    public static int Klargest(int[] arr,int k)
    {
        int n=arr.length;
        int kLarge=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0;i<k;i++)
        {
            int temp=Integer.MIN_VALUE;
            for(int j=0;j<n-i;j++)
            {
                if(temp<arr[j])
                {
                    temp=arr[j];
                    idx=j;
                }
            }
            if(idx!=n-i-1) {
                int temp1 = arr[idx];
                arr[idx] = arr[n - i - 1];
                arr[n - i - 1] = temp1;
            }
            kLarge=temp;

        }
        return kLarge;
    }
    public static void main(String[] args) {
      int[] arr={4,2,6,7,8,10,2,3,11};
        System.out.println(Klargest(arr,4));
        System.out.println(arr[arr.length-4]);
    }
}
