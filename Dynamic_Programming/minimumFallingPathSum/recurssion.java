package Dynamic_Programming.minimumFallingPathSum;

public class recurssion {

    public static int fallingPath(int[][]matrix,int i,int j)
    {

        if(i==0 && j>=0)
        {
            return matrix[i][j];
        }


        if(i<0 || j<0)
        {
            return (int) Math.pow(10, 9);
        }





          int dia_Left = matrix[i][j] + fallingPath(matrix, i - 1, j - 1);


            int down = matrix[i][j] + fallingPath(matrix, i - 1, j);


          if(j<matrix.length-1) {

              int dia_right = matrix[i][j] + fallingPath(matrix, i - 1, j + 1);

              return Math.min(dia_Left, Math.min(down, dia_right));

          }

            return Math.min(dia_Left,down);







    }
    public static void main(String[] args) {

       int ans= (int) Math.pow(10, 9);

       int[][] matrix =  {{-19,57},{-40,-5}};

          for(int j=matrix[0].length-1;j>=0;j--) {

               ans = Math.min(ans,fallingPath(matrix, matrix.length - 1, j));

              //System.out.println(ans);

          }

      System.out.println(ans);

    }


}
