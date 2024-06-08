package Dynamic_Programming.StairCase.Stair_Case_TabulationWay;

public class StairsTab {


    public static void main(String[] args) {

        int n=5;

    int[] DP = new int[n+1];

    DP[0]=1;
    DP[1]=1;

    for(int i=2;i<=n;i++)
    {
        DP[i]=DP[i-1]+DP[i-2];
    }

        System.out.println(DP[n]);


    }





}
