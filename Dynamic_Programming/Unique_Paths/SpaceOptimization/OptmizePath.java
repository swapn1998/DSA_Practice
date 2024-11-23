package Dynamic_Programming.Unique_Paths.SpaceOptimization;

public class OptmizePath {


    public static void main(String[] args) {

        int m=3;
        int n=3;
        int left=0;
        int up=0;
       int[] prev=new int[m];

       for(int i=0;i<3;i++)
       {
           int[] curr=new int[n];

           for(int j=0;j<n;j++)
           {

               if(i==0 && j==0)
               {
                   curr[j]=1;
               }

               else {
                   if(i>0)
                   {
                        up=prev[j];
                   }

                   if(j>0)
                   {
                       left=curr[j-1];
                   }

                   curr[j]= up+left;
               }

           }

           prev=curr;

       }

        System.out.println(prev[n-1]);




    }


}
