package Array;

public class WavePrint2D {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,5},
                {4,5,6,7},
                {7,8,9,10}
        };
        int row=3,col=arr[0].length;
        int c=0;
        while(c<col)
        {
            if(c%2==0)
            {
                for(int i=0;i<row;i++)
                {
                    System.out.print(arr[i][c]);
                }
                System.out.println();

                c++;
            }
            else
            {
                for(int i=row-1;i>=0;i--)
                {
                    System.out.print(arr[i][c]);
                }
                System.out.println();

                c++;
            }
        }
    }
}
