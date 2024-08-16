package Recursion.Easyqs;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,7,7,7,7,98,8};
        System.out.println(fn(arr,0,7));
    }

    public static int fun(int [] arr,int idx,int target)
    {
        if(idx==arr.length) return -1;
        if(arr[idx]==target) return idx;
        return fun(arr,idx+1,target);
    }

    public static ArrayList<Integer> fn(int[] arr,int idx,int target)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        if(idx==arr.length) return ans;
        if(arr[idx]==target)
        {
            ans.add(idx);

        }
        ArrayList<Integer> ansFromBelow= fn(arr,idx+1,target);
        ans.addAll(ansFromBelow);
        return ans;
    }
}
