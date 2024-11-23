package Dynamic_Programming.HouseRobber2.Memoization;

public class RobberMemoize {

    public static int sequence(int[] arr, int i,int[]DP) {


        if (i == 0) {
            return arr[i];

        }

        if (i < 0) {
            return 0;
        }

        if(DP[i]!=-1)
        {
            return DP[i];
        }

        int pick = arr[i];

        if (i > 1) {

            if (i == arr.length - 1 && i - 2 == 0) {
                pick = pick + 0;
            } else {
                pick = pick + sequence(arr, i - 2,DP);
            }


        }

        int notPick = sequence(arr, i - 1,DP);

        DP[i]= Math.max(pick, notPick);

        return DP[i];


    }


    public static void main(String[] args) {

        int[] arr1 = {200,3,140,20,10};

        int[] DP1 = new int[arr1.length + 1];

           for(int j=0;j<arr1.length;j++)
           {

               DP1[j]=-1;

           }

        System.out.println(sequence(arr1, arr1.length-1, DP1));


    }

}