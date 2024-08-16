package Array;

public class IntersectionArray {
    public static void main(String[] args) {
        int[] arr1={10,12,13,14,15};
        int[] arr2={10,11,13,13,15,16,17};
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if(arr1[i]>arr2[j])
            {
                j++;
            }
            else
            {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }

    }
}
