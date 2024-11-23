package Dynamic_Programming.MaxSum_NoAdjuscentElement.SubsequenceElementMemoization;

public class SubMemo {

    public static int Memo(int[] DP,int[] arr,int i){

        if(i<0)
        {
            return 0;
        }

        if(i==0)
        {
            return arr[0];
        }

        if(DP[i]!=-1)
        {
            return DP[i];
        }

        int pick = arr[i]+Memo(DP,arr,i-2);

        int notPick = Memo(DP,arr,i-1);

        DP[i] = Math.max(pick,notPick);

        return DP[i];


    }




    public static void main(String[] args) {


  int[] DP1 ={-1,-1,-1,-1};

  int[] arr1={2,1,4,9};

        System.out.println(Memo(DP1,arr1,3));






    }



}
