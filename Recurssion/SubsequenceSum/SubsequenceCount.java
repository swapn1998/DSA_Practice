package Recurssion.SubsequenceSum;

public class SubsequenceCount {

    public static int SubsequenceCount(int[] nums,int i,int k,int sum)
    {
        if(i>=nums.length)
        {
            if(sum==k)
            {
                return 1;
            }

            return 0;
        }

        sum = sum + nums[i];

        int l = SubsequenceCount(nums,i+1,k,sum);

        sum = sum - nums[i];

        int r = SubsequenceCount(nums,i+1,k,sum);

        return l + r;

    }

    public static void main(String[] args) {

       int [] nums ={1,2,1};

        System.out.println( SubsequenceCount( nums,0,2,0));

    }
}
