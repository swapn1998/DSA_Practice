package Recurssion.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortAlgo {

    public static void mergeSort(int[] arr, int low, int high)
    {
        if(low>=high)
        {
            return;
        }

        int mid = (low+high) / 2;

        mergeSort(arr,low,mid);

        mergeSort(arr,mid+1,high);

        merge(arr,low,mid,high);

    }

    public static void merge(int[] arr1, int low1, int mid1,int high1)
    {

        List<Integer> list = new ArrayList<>();

        int left =low1;

        int right = mid1 + 1;

        while(left<=mid1 && right<=high1)
        {
            if(arr1[left]<=arr1[right])
            {
                list.add(arr1[left]);
                left++;
            }

            else
            {
                list.add(arr1[right]);
                right++;
            }
        }


        while(left<=mid1)
        {
           list.add(arr1[left]);
                left++;

        }


        while(right<=high1)
        {
            list.add(arr1[right]);
                right++;

        }

    for(int i=low1;i<=high1;i++)
    {
        arr1[i]= list.get(i-low1);
    }

    }


    public static void main(String[] args) {

        int [] arr ={3,2,1,4,3};

        mergeSort(arr,0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

}
