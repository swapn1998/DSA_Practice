package Dynamic_Programming.MinimumPaths.Memoization;

public class MinPathMemoize {

    public static int Memoize(int i,int j,int[][] grid,int[][] DP){


        if(i==0 && j==0)
        {
            return grid[0][0];
        }

        if(i<0 || j<0)
        {
            return (int)Math.pow(10,9);
        }

        if(DP[i][j]!=-1)
        {

            return DP[i][j];
        }


        int up = grid[i][j]+Memoize(i-1,j,grid,DP);

        int left = grid[i][j]+Memoize(i,j-1,grid,DP);

        DP[i][j]= Math.min(up,left);

        return DP[i][j];


    }



    public static void main(String[] args) {


       int[][] grid1 = {{1,3,1},{1,5,1},{4,2,1}};

       int m = grid1.length;

       int n= grid1[0].length;

        int[][] DP1 = new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                DP1[i][j]=-1;
            }
        }

        int ans= Memoize(m-1,n-1,grid1,DP1);

        System.out.println(ans);


    }




}
