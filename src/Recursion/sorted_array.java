package Recursion;
//checking if array is sorted or nor
public class sorted_array {
    public static void main(String[] args) {
        int [] arr={3,2,3,4,5};
        System.out.println(sortedOrnot(arr,1));
    }

    public static boolean sortedOrnot(int[] arr,int idx)
    {
        if(idx==arr.length) return true;
        if(arr[idx-1]<=arr[idx])
        {
            return sortedOrnot(arr,idx+1);
        }
        return false;
    }
}
