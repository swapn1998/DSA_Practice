package Dynamic_Programming.MinimumPaths.Tabulation;

import java.util.Arrays;

public class Tabul {

    public static void main(String[] args) {

        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};

        int m = grid.length;

        int n= grid[0].length;

        int[][] DP = new int[m][n];

        for(int a=0;a<m;a++)
        {
            for(int b=0;b<n;b++)
            {
                DP[a][b]=-1;
            }
        }




        for(int i=0;i<m;i++)
        {

            for(int j=0;j<n;j++)
            {

                int up=(int)Math.pow(10,9);

                int left=(int)Math.pow(10,9);


                if(i==0 && j==0)
                {
                    DP[i][j]= grid[0][0];
                }

                else {
                    if (i > 0) {
                        up = grid[i][j] + DP[i - 1][j];
                    }

                    if (j > 0) {
                        left = grid[i][j] + DP[i][j - 1];

                    }

                    DP[i][j] = Math.min(up, left);

                }


            }


        }

        System.out.println(Arrays.deepToString(DP));
        System.out.println(DP[m-1][n-1]);








    }


}
