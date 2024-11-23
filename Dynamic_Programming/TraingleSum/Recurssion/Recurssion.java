package Dynamic_Programming.TraingleSum.Recurssion;

public class Recurssion {


    public static int Path(int[][]arr,int i,int j){


        if(i==arr.length-1)
        {
            return arr[i][j];
        }


        int down = arr[i][j] + Path(arr, i + 1, j);

        int diagonal = arr[i][j]+ Path(arr, i+1, j + 1);


        return Math.min(down,diagonal);

    }
    public static void main(String[] args) {


        int[][] arr1 = {{-1},{2,3},{1,-1,-3}};

        int m = arr1.length;

        int n = arr1[0].length;


        int ans = Path(arr1, 0, 0);

        System.out.println(ans);


    }

    }