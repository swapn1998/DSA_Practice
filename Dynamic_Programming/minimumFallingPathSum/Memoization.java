package Dynamic_Programming.minimumFallingPathSum;

import java.util.Arrays;

public class Memoization {



    public static int fallingPath(int[][]matrix,int i,int j,int[][]DP)
    {

        if(i==0 && j>=0)
        {
            return matrix[i][j];
        }


        if(i<0 || j<0)
        {
            return (int) Math.pow(10, 9);
        }

        if(DP[i][j]!=-1)
        {
            return DP[i][j];
        }





        int dia_Left = matrix[i][j] + fallingPath(matrix, i - 1, j - 1,DP);


        int down = matrix[i][j] + fallingPath(matrix, i - 1, j,DP);


        if(j<matrix.length-1) {

            int dia_right = matrix[i][j] + fallingPath(matrix, i - 1, j + 1,DP);

            DP[i][j]= Math.min(dia_Left, Math.min(down, dia_right));
            return DP[i][j];

        }

        DP[i][j]= Math.min(dia_Left,down);

        return DP[i][j];







    }
    public static void main(String[] args) {

        int ans= (int) Math.pow(10, 9);

        int[][] matrix =  {{-19,57},{-40,-5}};

        int[][] DP = new int[matrix.length][matrix.length];

        for (int row[] : DP)
            Arrays.fill(row, -1);


        for(int j=matrix[0].length-1;j>=0;j--) {

            DP[0][j] = fallingPath(matrix, matrix.length - 1, j,DP);


        }

        System.out.println(DP[0][0]);

    }



}
