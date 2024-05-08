package Recurssion.Subsequence;

import java.util.ArrayList;

public class subsequence {

    public static void printSubsequence(ArrayList<Integer> list, int i, int n,int [] arr)
    {
        if(i>=n)
        {
            System.out.println(list);
            return;
        }





        list.add(arr[i]);
        printSubsequence(list,i+1,n,arr);
       list.removeLast();
        printSubsequence(list,i+1,n,arr);



    }


    public static void main(String[] args) {

        int [] arr1={3,1,2};

        ArrayList<Integer> list1 =new ArrayList<>();

        printSubsequence(list1,0,arr1.length,arr1);

    }


}
