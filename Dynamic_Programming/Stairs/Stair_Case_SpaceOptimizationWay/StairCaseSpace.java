package Dynamic_Programming.Stairs.Stair_Case_SpaceOptimizationWay;

public class StairCaseSpace {

    public static void main(String[] args) {

        int n= 5;

        int prev =1;

        int prePrev =1;

        for(int i=2;i<=n;i++)
        {
            int curr = prev +prePrev;

            prePrev=prev;

            prev =curr;


        }

        System.out.println(prev);;

    }


}
