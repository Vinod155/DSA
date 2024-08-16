package BinarySearch;

public class squareRoot {
    public static  int Square(int num)
    {
        int r=num-1,l=0;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(mid*mid<num)
            {
                l=mid+1;
            }
            else if(mid*mid>num)
            {
                r=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Square(49));
    }
}
