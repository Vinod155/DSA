package Recursion.Easyqs;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr={5,6,7,8,1,2,3};
        System.out.println(fun(arr,5,0,arr.length-1));
    }

    static int fun(int[] arr,int target,int st,int end)
    {
        int mid=st+(end-st)/2;
        if(arr[mid]==target) return mid;
        if(arr[st]<arr[mid])
        {
            if(target<=arr[mid] && target >=arr[st])
            {
                return fun(arr,target,st,mid-1);
            }
            else {
                return fun(arr,target,mid+1,end);
            }
        }
        else {
            if(target<=arr[mid] && target >=arr[st])
            {
                return fun(arr,target,st,mid-1);
            }
            else {
                return fun(arr,target,mid+1,end);
            }
        }

    }
}
