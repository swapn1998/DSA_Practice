package Dynamic_Programming.FrogJump.SapceOptimization;

public class JumpFrog {






    public static void main(String[] args) {



            int n= 4;

            int prev=0;

            int prev2=0;

            int[] arr={10,20,30,10};

            for(int i=1;i<n;i++)
            {
                int left = prev + Math.abs(arr[i] - arr[i-1]);

                int right = Integer.MAX_VALUE;

                if(i>1) {

                    right = prev2 + Math.abs(arr[i] - arr[i - 2]);

                }

                int curr = Math.min(left,right);

                prev2=prev;

                prev=curr;

            }

            System.out.println( prev);

    }


}
