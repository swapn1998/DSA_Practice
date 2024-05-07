package Recurssion.ReverseArray;

import java.util.Arrays;

public class Reverse {

    public static void reverse(int l, int r,int[] arr)
    {

        if(l>=r)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }

        swap(l,r, arr);

        reverse(l+1,r-1,arr);


    }

    public static int[] swap(int i, int j, int[] array) {


        int temp = array[j];

        array[j]= array[i];

        array[i]= temp;

        return array;


    }


    public static void main(String[] args) {

        int[] nums={1,2,3,4,5};

        reverse(0,nums.length-1,nums);

    }

}
