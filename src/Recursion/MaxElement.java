package Recursion;

public class MaxElement {
    public static void main(String[] args) {
      int[] arr={2,3,5,6,4,5,99,70};
      int max=Integer.MIN_VALUE;
        System.out.println(maxElement(arr,0));
    }

    public static int maxElement(int []arr,int idx)
    {
        if(idx==arr.length-1) return arr[idx];

        return Math.max(arr[idx],maxElement(arr,idx+1));

    }
}
