package Recurssion.Palindrome_Partioning;

import java.util.ArrayList;
import java.util.List;

public class palindrome {

    public static boolean isPalindrome(String s){

        int l = 0;
        int r = s.length()-1;
        String[] arr = s.trim().split("");
        while(l<=r)
        {
            if(arr[l].equals(arr[r]))
            {
                l++;
                r--;
            }

            else
            {
                return false;
            }

        }

        return true;

    }

   public static void palindromePartion(String[] str,int ind,List<String> list){

       if(ind>str.length-1)
       {
           System.out.println(list);

            return;
       }

          String bag="";
           for(int j=ind;j<str.length;j++)
           {
               bag=bag+str[j] ;


               if(isPalindrome(bag))
               {
                   list.add(bag);

                   palindromePartion(str,ind+1,list);

                   ind=ind+1;

                   list.removeLast();
               }

               else {
                   return;
               }


           }





    }


    public static void main(String[] args) {

        String s= "aab";

        String[] st = s.trim().split("");
        List<String> list1 = new ArrayList<>();

        palindromePartion(st,0,list1);




    }



}
