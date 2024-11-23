package Dynamic_Programming.Fibbonacci.Memozation;

import java.util.Arrays;

public class FibMemoization {


    public static int fibMemo(int[] DP, int n)
    {

        if(n<=1)
        {
            return n;
        }

        if(DP[n]!=-1)
        {
            return DP[n];
        }

        DP[n] = fibMemo(DP,n-1)+fibMemo(DP,n-2);

        return DP[n];

    }

    public static void main(String[] args) {


        int[] DP = {-1,-1,-1,-1,-1};

        System.out.println(fibMemo(DP,4));

        System.out.println(Arrays.toString(DP));

    }



}
