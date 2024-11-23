package Dynamic_Programming.FrogJump.Tabulation;

public class FrogTablu {



    public static void main(String[] args) {

        int n= 4;
        int[] arr={10,20,30,10};
        int[] DP = new int[n+1];

        DP[0]=0;

     for(int i=1;i<=n;i++)
     {
         int left = DP[i - 1] + Math.abs(arr[i] - arr[i-1]);

         int right =Integer.MAX_VALUE;

          if(i>1) {

               right = DP[i - 2] + Math.abs(arr[i] - arr[i - 2]);

          }

          DP[i] = Math.min(left,right);
     }

        System.out.println( DP[n-1]);





    }


}
