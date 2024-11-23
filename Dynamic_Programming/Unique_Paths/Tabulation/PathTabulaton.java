package Dynamic_Programming.Unique_Paths.Tabulation;

public class PathTabulaton {



    public static void main(String[] args) {

        int m=3;
        int n=3;
        int up=0;
        int left=0;
        int[][] DP1 = new int[m][n];

        for(int a=0;a<m;a++)
        {
            for(int b=0;b<n;b++)
            {
                DP1[a][b]=-1;
            }

        }

        for(int i=0;i<m;i++)
        {

            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0)
                {
                    DP1[i][j]=1;
                }

                else {
                    if(i>0)
                    {
                         up =DP1[i-1][j];
                    }

                    if(j>0)
                    {
                         left=DP1[i][j-1];
                    }

                    DP1[i][j]=up+left;

                }



            }



        }

        System.out.println(DP1[m-1][n-1]);



    }



}
