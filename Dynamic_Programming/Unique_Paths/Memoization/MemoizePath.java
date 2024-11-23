package Dynamic_Programming.Unique_Paths.Memoization;

public class MemoizePath {


    public static int paths(int i,int j,int[][]DP)
    {


        if(i==0 && j==0)
        {
            return 1;
        }


        if(i<0 ||j<0)
        {
            return 0;
        }

        if(DP[i][j]!=-1)
        {
            return DP[i][j];
        }


        int left =  paths(i, j-1,DP);

        int right = paths( i-1,j,DP);

        DP[i][j]= left + right;

        return DP[i][j];


    }


    public static void main(String[] args) {


        int[][] DP1 = new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                DP1[i][j]=-1;
            }

        }

        int ans = paths(1,1,DP1);

        System.out.println(ans);



    }



}
