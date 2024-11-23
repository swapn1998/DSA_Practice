package Dynamic_Programming.NinjaTraining.Recursion;

public class Ninja {


    public static int maxPoints(int days,int last,int[][] P,int maxi,int points){

        if(days==0)
        {
            maxi=0;

            for(int i=0;i<P[0].length;i++)
            {
                maxi=Math.max(maxi,P[0][i]);
            }

            return maxi;

        }

        maxi=0;

        for(int i=0;i<P[0].length;i++)
        {

            if(i!=last)
            {
                points=P[days][i] + maxPoints( days-1,i,P,maxi,points);

                maxi=Math.max(maxi,points);
            }


        }

        return maxi;


    }

    public static void main(String[] args) {



      int  n1= 10;

      int[][]  points = {{8, 7, 3},
              {10, 6, 3},
              {1, 1, 4},
              {10, 2, 9},
              {2, 10, 6},
              {4, 3, 6},
              {3, 6, 9},
              {7, 8, 8},
              {3, 3, 10},
              {5, 2, 10}};


        System.out.println(maxPoints(n1-1,n1,points,0,0));



    }


}
