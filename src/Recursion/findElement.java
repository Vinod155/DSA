package Recursion;

public class findElement {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,6,7,8};
        int target=60;
        System.out.println(find(arr,0,target));
    }

    public static int find(int[] arr,int idx,int target)
    {
        if(idx>=arr.length) return -1;
        return arr[idx]==target?idx:find(arr,idx+1,target);
    }
}
