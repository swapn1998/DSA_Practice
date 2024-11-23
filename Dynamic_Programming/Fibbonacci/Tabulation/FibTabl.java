package Dynamic_Programming.Fibbonacci.Tabulation;

import java.util.Arrays;

public class FibTabl {




    public static void main(String[] args) {

        int n=5;
        int[] DP = new int[n+1];

        DP[0]=0;
        DP[1]=1;

        for(int i=2;i<=n;i++)
        {
            DP[i]=DP[i-1]+DP[i-2];
        }

        System.out.println(Arrays.toString(DP));

        System.out.println(DP[n]);


    }


}
