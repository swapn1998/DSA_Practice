package Recurssion.Permutations;

import java.util.ArrayList;
import java.util.List;

public class Permut {


        public static void Permutations(List<List<Integer>> list,ArrayList<Integer> ds,int[] arr, int ind,int[] map)
        {


                if(ds.size()>=arr.length) {

                    list.add(new ArrayList(ds));
                    return;
                }



            for(int i=0;i<arr.length;i++)
            {
                if(map[i]!=1)
                {

                    ds.add(arr[i]);

                    map[i]=1;

                    Permutations(list,ds,arr,i+1,map);

                    ds.removeLast();

                    map[i]=0;

                }

            }





        }


    public static void main(String[] args) {


            List<List<Integer>> list = new ArrayList<>();

            ArrayList<Integer> list1 = new ArrayList<>();

            int[] nums = {1,2,3};

            int[] map1 = new int[nums.length];

            Permutations(list,list1,nums,0,map1);

        System.out.println(list);



        }


    }

