package Dynamic_Programming.MaxSum_NoAdjuscentElement.Tabulation;

public class SubTabl {



    public static void main(String[] args) {

        int[] arr={2,7,9,3,1};

        int[] DP =new int [arr.length+1];

        for(int i=0;i<=arr.length;i++)
        {
            DP[i]=-1;
        }


        DP[0]= arr[0];


        for(int i=1;i<arr.length;i++) {

            int pick = arr[i] ;

            if(i>1)
            {
                pick = pick + DP[i - 2];

            }

            int notPick = DP[i - 1];

            DP[i] = Math.max(pick, notPick);

        }

        System.out.println(DP[arr.length-1]);




    }


}
