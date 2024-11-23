package Dynamic_Programming.MaxSum_NoAdjuscentElement.SpaceOptimization;

public class SeqOptimize {


    public static void main(String[] args) {


        int[] arr={2,7,9,3,1};

        int prev= arr[0];

        int prev2=0;

        for(int i=1;i<arr.length;i++) {

            int pick = arr[i];

                    if(i>1) {
                        pick = pick + prev2;
                    }

            int notPick = prev;

            int curr = Math.max(pick, notPick);

            prev2 = prev;

             prev = curr;


        }

        System.out.println(prev);



    }


}
