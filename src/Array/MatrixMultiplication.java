package Array;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr1={{1,2,3},{1,2,3}};
        int [][] arr2={{2,3},{4,5},{6,7}};

        int row1=arr1.length,row2=arr2.length;
        int col1=arr1[0].length,col2=arr2[0].length;
        int[][] res=new int[row1][col2];

        if(col1!=row2)
        {
            System.exit(1);
        }

        for (int i = 0; i < row1; i++) {

            int col=0;
            while(col<col2) {
                int temp=0;

                for (int j = 0; j < col1; j++) {
                    temp += arr1[i][j] * arr2[j][col];

                }
                res[i][col++] = temp;
            }


        }

        for (int i = 0; i < row1; i++) {

            for (int j = 0; j < col2; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();

        }


    }
}
