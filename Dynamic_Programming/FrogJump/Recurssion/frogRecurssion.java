package Dynamic_Programming.FrogJump.Recurssion;

public class frogRecurssion {

    public static int frogJump(int ind,int[] height){

        if(ind==0)
        {
            return 0;
        }

        int firstStep =  frogJump(ind-1,height) + Math.abs(height[ind]-height[ind-1]);

        if(ind>1) {
            int secondStep = frogJump(ind - 2, height) + Math.abs(height[ind] - height[ind - 2]);

            return Math.min(firstStep,secondStep);
        }

        return firstStep;

    }


    public static void main(String[] args) {

        int n = 5;
        int[] h= {10,30,40,50,20};
        System.out.println(frogJump(n-1,h));


    }



}
