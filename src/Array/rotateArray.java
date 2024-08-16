package Array;

public class rotateArray {
    public static void main(String[] args) {
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int m = matrix.length;

        for (int i = 0; i < m; i++) {
            int st = 0, end = m - 1;
            while (st < end)
            {
                int temp=matrix[st][i];
                matrix[st][i]=matrix[end][i];
                matrix[st][i]=temp;
                st++;
                end--;
            }
        }
        for (int i = 0; i < m; i++) {
            for(int j=0;j<m;j++)
            {
                if(i<j)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
    }
}
