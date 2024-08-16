package Hashmap.Questions;

public class findPair {
    public static void main(String[] args) {
        //int[] arr=new int[]{20,25,3,5,7,10};
        System.out.println(findPair(new int[]{20,25,3,5,2,10},10));
    }

    public  static  boolean findPair(int[] arr,int k)
    {
        int [] rem=new int[k];
        for(int i:arr)
        {
            i=i%k;
            rem[i]++;
        }
        if(rem[0]%2!=0)return false;
        for(int i=1;i<k/2;i++)
        {
            if(rem[i]!=rem[k-i])return false;
        }
        return true;
    }
}
