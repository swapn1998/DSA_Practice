package Recurssion.SubsequenceSum;

import java.util.ArrayList;

public class UniqueSubsequence {


    public static boolean Sum(int[] nums, ArrayList<Integer> arrayList, int k, int i, int sum)
    {

        if(i>=nums.length)
        {
            if(sum==k)
            {
                System.out.println(arrayList);
                return true;
            }

            return false;
        }

        arrayList.add(nums[i]);

        sum=sum+nums[i];

        if(Sum(nums,arrayList,k,i+1,sum)==true) {
           return true ;
        }

        arrayList.removeLast();

        sum=sum-nums[i];

        if(Sum(nums,arrayList,k,i+1,sum)==true){

            return true;
        };

        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr =new ArrayList<>();

        int[] nums ={1,2,1};

        int k=2;

        Sum(nums,arr,k,0,0);

    }

}
