package Dynamic_Programming.MinimumPaths.Recurssion;

public class MinPath {


    public static int Path(int[][]arr,int i,int j){


        if(i==0 && j==0)
        {
            return arr[0][0];
        }

        if(i<0||j<0)
        {
             return (int) Math.pow(10, 9);
           // return (int)Integer.MAX_VALUE;
        }


           int up = arr[i][j] + Path(arr, i - 1, j);

           int left = arr[i][j]+ Path(arr, i, j - 1);


            return Math.min(left,up);

    }
    public static void main(String[] args) {


        int[][] arr1=  {{1,2,3},{4,5,6}};

        int m = arr1.length;

        int n= arr1[0].length;



        int ans = Path(arr1,m-1,n-1);

        System.out.println(ans);



    }


}
