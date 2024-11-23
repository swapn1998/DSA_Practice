package Dynamic_Programming.Stairs.Stair_Case_RecurssiveWay;

public class stairCase {

    public static int Stairs(int ind)
    {
        if(ind==0)
        {
            return 1;
        }

        if(ind==1)
        {
            return 1;
        }

        int left = Stairs(ind-1);

        int right = Stairs(ind-2);

        return left + right;



    }


    public static void main(String[] args) {


        System.out.println(Stairs(5));

    }



}
