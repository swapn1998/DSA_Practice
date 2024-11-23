package Dynamic_Programming.MaxSum_NoAdjuscentElement.Recursion;

public class Subsequnece {

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

                    if(i==arr.length-1 && i-2==0)
                    {
                        pick = pick + 0;
                    }

                    else {
                        pick = pick + sequence(arr, i - 2);
                    }


                }

        int notPick = sequence(arr,i-1);

        return Math.max(pick,notPick);




    }




    public static void main(String[] args) {

        int[] arr1={1,2,3,1};

        System.out.println(sequence(arr1,3));



    }




}
