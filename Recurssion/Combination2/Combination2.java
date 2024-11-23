package Recurssion.Combination2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination2 {

public static void CombinationSum2(int ind,int target, int[] arr, List<List<Integer>> ans, List<Integer>ds)
{
    if(target==0)
    {
        ans.add(new ArrayList<>(ds));
        return;
    }

    for(int i=ind;i<arr.length;i++)
    {

        if(i>ind && arr[i] == arr[i-1])
        {
            continue;
        }

        if(arr[i]> target)
        {
            break;
        }

        ds.add(arr[i]);

        CombinationSum2(i+1,target-arr[i],arr,ans,ds);

        ds.remove(ds.size()-1);

    }
}
    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();

        int [] arr1 = {10,1,2,7,6,1,5};

        Arrays.sort(arr1);
        CombinationSum2(0,10,arr1,list,new ArrayList<Integer>());

        System.out.println(list);
    }


}
