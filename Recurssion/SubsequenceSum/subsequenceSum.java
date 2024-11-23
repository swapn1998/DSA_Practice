package Recurssion.SubsequenceSum;

import java.util.ArrayList;
import java.util.List;

public class subsequenceSum {

public static void sum(ArrayList<Integer>list, int sum1,int[] nums,int i,int ans)
{
    if(i>=nums.length)
    {
        if(sum1==ans)
        {
            System.out.println(list);
        }

        return;
    }

    list.add(nums[i]);

    sum1=sum1+nums[i];

    sum(list,sum1,nums,i+1,ans);

    list.removeLast();

    sum1=sum1-nums[i];

    sum(list,sum1,nums,i+1,ans);


}
    public static void main(String[] args) {

    ArrayList<Integer>list1 = new ArrayList<>();

    int sum1=0;

    int i1=0;

    int[] nums1={1,2,1};

    int ans1 =2;

    sum(list1,sum1,nums1,i1,ans1);

    }



}
