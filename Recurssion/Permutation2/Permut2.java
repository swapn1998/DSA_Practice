package Recurssion.Permutations;

import java.util.Arrays;

public class Permut2 {

    public static int[]  Swap(int ind, int i,int[] arr1)
    {
        int temp = arr1[i];
        arr1[i]=arr1[ind];
        arr1[ind]=temp;
        return arr1;

    }


    public static void Permutation(int ind,int[] arr)
    {

        if(ind==arr.length)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i=ind;i<arr.length;i++)
        {

             Swap(ind,i,arr);

            Permutation(ind+1,arr);

             Swap(ind,i,arr);

        }


    }

    public static void main(String[] args) {


        int[] nums = {1,2,3};

        Permutation(0,nums);






    }


}
