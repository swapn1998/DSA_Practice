package Dynamic_Programming.NinjaTraining.Memoization;

import java.util.Arrays;

public class Memoize {

    public static int maxPoints(int days,int last,int[][] P,int[][]DP){


        if(DP[days][last]!=-1)
        {
            return DP[days][last];
        }

        if(days==0)
        {
           int maxi=0;

            for(int i=0;i<=2;i++)
            {
                if(i!=last) {
                    maxi = Math.max(maxi, P[0][i]);
                }

            }

            return DP[days][last] = maxi;

        }



        int maxi=0;

        for(int i=0;i<=2;i++)
        {

            if(i!=last)
            {
              int  sum = P[days][i] + maxPoints( days-1,i,P,DP);

                maxi=Math.max(maxi,sum);
            }


        }

        DP[days][last]= maxi;

        return DP[days][last];


    }

    public static void main(String[] args) {



        int  n= 10;

        int dp[][] = new int[n][4];
        for (int[] row : dp)
            Arrays.fill(row, -1);



        int[][]  points = {{8, 7, 3},
                {10, 6, 3},
                {1, 1, 4},
                {10, 2, 9},
                {2, 10, 6},
                {4, 3, 6},
                {3, 6, 9},
                {7, 8, 8},
                {3, 3, 10},
                {5, 2, 10}};


        System.out.println(maxPoints(n-1,3,points,dp));



    }


}
