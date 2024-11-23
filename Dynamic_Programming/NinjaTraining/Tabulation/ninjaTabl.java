package Dynamic_Programming.NinjaTraining.Tabulation;

public class ninjaTabl {

    public static void main(String[] args) {




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

        int n =points.length;

        int dp[][] = new int[n][4];




        dp[0][0]=Math.max(points[0][1],points[0][2]);
        dp[0][1]=Math.max(points[0][0],points[0][2]);
        dp[0][2]=Math.max(points[0][1],points[0][0]);
        dp[0][3]=Math.max(points[0][0],Math.max(points[0][2],points[0][1]));


        for(int day=1;day<n;day++)
        {
            for(int last=0;last<4;last++)
            {
                dp[day][last]=0;

                for(int task=0;task<=2;task++)
                {
                    if(last!=task)
                    {
                        int sum =points[day][task] + dp[day-1][last];
                        dp[day][last]=Math.max(dp[day][last],sum);
                    }
                }
            }
        }

        System.out.println(dp[n-1][3]);




    }


}
