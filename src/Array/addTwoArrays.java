package Array;

import java.util.ArrayList;

public class addTwoArrays {
    public static void main(String[] args) {
        int [] arr1={2,3,6,7};
        int[] arr2={1,2,3,4,4,6};
        Add(arr1,arr2);

    }
    public static void Add(int[]arr1,int[] arr2)
    {
        int carry=0;
        int pt1=arr1.length-1,pt2=arr2.length-1;

        int len=Math.max(pt1,pt2);
        int [] ans=new int[len+1];
        while(pt1>=0 || pt2>=0)
        {
            int temp=0;
            if(pt1>=0)
            {
                temp+=arr1[pt1--];
            }
            if(pt2>=0)
            {
                temp+=arr2[pt2--];
            }
            temp+=carry;
            carry=0;
            if(temp>=10)
            {
                carry=temp/10;
                temp=temp%10;
            }

            ans[len--]=temp;


        }




        for (Integer an : ans) {
            System.out.println(an);
        }

    }
}
