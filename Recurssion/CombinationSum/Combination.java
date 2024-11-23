package Recurssion.CombinationSum;

import java.util.ArrayList;
import java.util.List;

public class Combination {


    public static void findCombinationsSum(int target, int i, int[] arr, List<List<Integer>>ans, List<Integer> ds)
    {

        if(i == arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ds));
            }

            return;
        }

        if(arr[i]<=target)
        {

            ds.add(arr[i]);
            findCombinationsSum(target-arr[i],i,arr,ans,ds);
            ds.remove(ds.size()-1);
        }

        findCombinationsSum(target,i+1,arr,ans,ds);

    }

    public static void main(String[] args) {

        int [] candidate= {2,3,6,7};

        List<List<Integer>> ans = new ArrayList<>();

        findCombinationsSum(7,0,candidate, ans,new ArrayList<>());

        System.out.println(ans);


    }
}
