package Dynamic_Programming.MaxmumSum.RecurssionWay;

public class maxSum {



    public static int Max(int[] nums,int ind){

        if(ind==0)
        {

            return nums[ind];

        }


        if(ind<0)
        {

            return 0;

        }


        int pick = nums[ind] + Max(nums,ind-2);

        int Notpick = 0 + Max(nums,ind-1);

        return Math.max(pick,Notpick);


    }




public static void main(String[] args) {

        int[] nums = {1,2,3,1};

    System.out.println(Max(nums,nums.length-1));



}


}
