package Dynamic_Programming.HouseRobber2.Recurssion;

public class robberRecurr {

    public static int sequence(int[] arr,int i){


        if(i==0)
        {
            return arr[i];

        }

        if(i<0)
        {
            return 0;
        }





        int pick= arr[i];

        if(i>1)
        {
            pick = pick + sequence(arr, i - 2);

        }

        int notPick = sequence(arr,i-1);

        return Math.max(pick,notPick);




    }




    public static void main(String[] args) {

        int[] arr1 = {1,2,3};

        System.out.println(sequence(arr1, arr1.length-1));


    }
}
