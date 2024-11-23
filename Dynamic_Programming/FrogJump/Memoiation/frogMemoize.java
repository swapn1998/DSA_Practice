package Dynamic_Programming.FrogJump.Memoiation;

public class frogMemoize {

    public static int Memoize(int ind,int[] height,int[] DP){


        if(ind==0)
        {
            return 0;
        }

        if(DP[ind]!=-1)
        {
            return DP[ind];
        }

        int right = Integer.MAX_VALUE;

        int left = Memoize(ind-1,height,DP) + Math.abs(height[ind]-height[ind-1]);

         if(ind>1) {

              right = Memoize(ind - 2, height, DP) + Math.abs(height[ind] - height[ind - 2]);

         }

        DP[ind] = Math.min(left,right);

         return DP[ind];


    }

    public static void main(String[] args) {


        int[] DP1 = {-1,-1,-1,-1,-1};

        int n=4;

       int[] h = {10,20,30,10};

        System.out.println(Memoize(n-1,h,DP1));

    }


}
