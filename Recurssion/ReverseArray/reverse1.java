package Recurssion.ReverseArray;

import java.util.Arrays;

public class reverse1 {

public static void reverse(int i,int[] arr)
{
    if(i>=arr.length/2)
    {
        System.out.println(Arrays.toString(arr));
        return;
    }

    swap(i,arr.length-i-1,arr);
    reverse(i+1, arr);


}

public static int[] swap(int l,int m,int[] array)
{
    int temp = array[m];
    array[m] = array[l];
    array[l]=temp;
    return array;
}




    public static void main(String[] args) {

        int [] nums ={1,2,3,4,5};

        reverse(0,nums);


    }

}
