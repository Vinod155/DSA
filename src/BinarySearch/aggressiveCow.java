package BinarySearch;


import java.util.Arrays;

public class aggressiveCow {

    public static int arrange(int[] arr,int c)
    {
        Arrays.sort(arr);
        int l=Integer.MAX_VALUE;
        int r=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(l>i)
            {
                l=i;
            }
            if(r<i)
            {
                r=i;
            }
        }
        int ans=0;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(good(arr,c,mid))
            {
                l=mid+1;
                ans=mid;
            }
            else {
                r=mid-1;
            }
        }
        return ans;
    }
    public static boolean good(int[] arr,int c,int mid)
    {
        int count=1;
        int last_pos=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-last_pos>=mid)
            {
                count++;
                if(count==c)
                {
                    return true;
                }
                last_pos=arr[i];
            }
        }
        return false;
    }

    public static void main(String[] args) {
       int[] arr={1,2,8,4,9};
        System.out.println(arrange(arr,3));
    }
}
