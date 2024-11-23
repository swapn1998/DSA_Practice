package Dynamic_Programming.Stairs.Stair_Memorize;

public class StairCaseMemorize {

        public static int Stairs(int ind,int[] DP)
        {
            if(ind<=1)
            {
                return 1;
            }

            if(DP[ind]!=-1)
            {
                return DP[ind];
            }

         return  DP[ind] = Stairs(ind-1,DP) + Stairs(ind-2,DP);





        }


        public static void main(String[] args) {

            int n=5;

            int[] DP1 ={-1,-1,-1,-1,-1,-1};

            System.out.println(Stairs(n,DP1));

        }




}
