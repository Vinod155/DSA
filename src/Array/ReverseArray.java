package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr={1,2,3,4,5,6};

        int end=arr.length-1,st=0;
        while(st<end)
        {
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        krotate(arr1,3);


    }

    public static void krotate(int[] arr,int k)
    {
        int idx=arr.length-k,i=0;
        int[] ans=new int[arr.length];
        for( i=0;i<k;i++)
        {
            ans[i]=arr[idx++];
        }
        for(int j=0;j<arr.length-k;j++)
        {
            ans[i++]=arr[j];
        }
        for (int j : ans) {
            System.out.println(j);
        }
    }
}
