package Dynamic_Programming.Unique_Paths.Recurssion;

public class Solution {


    public static int paths(int i,int j)
    {


        if(i==0 && j==0)
        {
            return 1;
        }


        if(i<0 ||j<0)
        {
            return 0;
        }


        int left =  paths(i, j-1);

        int right = paths( i-1,j);

        return left + right;


    }


    public static void main(String[] args) {


       int ans = paths(1,1);

        System.out.println(ans);



    }



}
