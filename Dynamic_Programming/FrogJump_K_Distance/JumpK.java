package Dynamic_Programming.FrogJump_K_Distance;

public class JumpK {


    public static int frogJump(int ind,int[] height,int k){

        if(ind==0)
        {
            return 0;
        }


        int min1= Integer.MAX_VALUE;

        for(int i=1;i<=k;i++) {

            if (ind - i >= 0) {

                int firstStep = frogJump(ind - i, height, k) + Math.abs(height[ind] - height[ind - i]);

                min1 = Math.min(firstStep,min1);
            }



        }

        return min1;

    }


    public static void main(String[] args) {

        int n = 5;
        int[] h= {10, 30, 40, 50, 20};
        System.out.println(frogJump(n-1,h,3));


    }



}
