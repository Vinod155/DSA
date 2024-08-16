package BinarySearch;

public class goodTimes {

    public static  int goodFunction(int n,int x, int y)
    {
       return (n/x+n/y);
    }
    public static int getMinimumTime(int n,int x,int y)
    {
        int l=0,r=Math.max(x,y)*n;
        int ans=0;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int val=goodFunction(mid,x,y);
            if(val>=n-1)
            {
                r=mid-1;
                ans=mid;
            }
            else {
                l=mid+1;
            }
        }
        return ans+Math.min(x,y);

    }

    public static void main(String[] args) {
        System.out.println(getMinimumTime(4,1,1));
    }


}
