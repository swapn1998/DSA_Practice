package Recurssion.Subsequence;

import java.util.ArrayList;
import java.util.List;

class Solution {


    public static void groups(int[] nums, List<List<Integer>> list,List<Integer> arr, int i) {

        if (i >= nums.length) {
            //System.out.println(list);

            list.add(new ArrayList(arr));

            return;
        }

        arr.add(nums[i]);
        groups(nums,list,arr,i+1);
        arr.removeLast();
        groups(nums,list,arr,i+1);

    }



    public static List<List<Integer>> subsets(int[] nums1) {

           int i1=0;

         List<List<Integer>> list1 = new ArrayList<>();

         List<Integer> arr1 = new ArrayList<>();

          groups(nums1,list1,arr1,i1);

        return list1;

        }





    public static void main(String[] args) {


        int [] nums = {1,2,3};
        System.out.println( subsets(nums));

    }




}