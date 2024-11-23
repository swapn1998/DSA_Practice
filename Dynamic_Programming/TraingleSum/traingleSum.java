package Dynamic_Programming.TraingleSum;

public class traingleSum {

    public static void main(String[] args) {


       // int[][] arr = {{2},{3,4},{6,5,7},{4,1,8,3}};

        int[][] arr = {{-10}};

        int sum=0;


        for(int i=0;i<arr.length;i++)
        {
            int min=Integer.MAX_VALUE;

            for(int j=0;j<arr[i].length;j++)
            {

                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                }

            }

            sum=sum+min;

        }

        System.out.println(sum);

    }



}
