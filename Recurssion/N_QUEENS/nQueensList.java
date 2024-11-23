//package Recurssion.N_QUEENS;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class nQueensList {
//
//    public static Boolean Check(int r, int c,String[][] str,int n)
//    {
//        int x =r;
//        int y=c;
//
//        r=x;
//        c=y;
//        // 1st cond check from left to right
//        while(c < n)
//        {
//            if(str[r][c].equals("Q"))
//            {
//                return false;
//            }
//
//            c++;
//
//        }
//
//        r=x;
//        c=y;
//        // 2nd cond check from Top to Bottom
//        while(r < n)
//        {
//            if(str[r][c].equals("Q"))
//            {
//                return false;
//            }
//
//            r++;
//        }
//
//        // 3 cond check from South-East
//        r=x;
//        c=y;
//
//        while(r < n && c<n)
//        {
//            if(str[r][c].equals("Q"))
//            {
//                return false;
//            }
//
//            r++;
//            c++;
//
//        }
//
//        // 4 cond check North East direction
//        r=x;
//        c=y;
//
//        while(r >=0 && c<n)
//        {
//            if(str[r][c].equals("Q"))
//            {
//                return false;
//            }
//
//            r--;
//            c++;
//
//        }
//
//        // 5 cond check from right to left
//        r=x;
//        c=y;
//
//        while(c>=0)
//        {
//            if(str[r][c].equals("Q"))
//            {
//                return false;
//            }
//
//
//            c--;
//
//        }
//
//        // 6 cond check from Bottom to Top
//        r=x;
//        c=y;
//
//        while(r>=0)
//        {
//            if(str[r][c].equals("Q"))
//            {
//                return false;
//            }
//
//
//            r--;
//
//        }
//
//        // 7 cond check from North-West direction
//        r=x;
//        c=y;
//
//        while(r>=0 && c>=0)
//        {
//            if(str[r][c].equals("Q"))
//            {
//                return false;
//            }
//
//
//
//            r--;
//            c--;
//
//        }
//
//
//        // 8 cond check from Top to Bottom
//        r=x;
//        c=y;
//
//        while(r < n && c>=0)
//        {
//            if(str[r][c].equals("Q"))
//            {
//                return false;
//            }
//
//
//            r++;
//            c--;
//
//        }
//
//
//        return true;
//
//    }
//
//
//
//    public static void Queens(List<List<String>>lists,int n,int row, int col,List<List<String>>ans)
//    {
//        if(col>=n)
//        {
//           ans.add();
//            return;
//        }
//
//        for(int i=0;i<n;i++)
//        {
//
//            if(Check(i,col,arr,n))
//            {
//                arr[i][col]="Q";
//
//                Queens( arr,n,i, col+1);
//
//                arr[i][col]=".";
//
//            }
//
//
//        }
//
//
//    }
//
//
//
//    public static void main(String[] args) {
//
//        int n=4;
//        String [][] arr1 = new String[n][n];
//
//        List<List<String>> list1 = new ArrayList<>();
//        List<List<String >>ans1=new ArrayList<>();
//        for(int i=0;i<n;i++)
//        {
//            List<String> list = new ArrayList<>();
//
//            for(int j=0;j<n;j++)
//            {
//                list.add(".");
//            }
//
//            list1.add(list);
//
//        }
//
//        System.out.println(list1);
//
//        //System.out.println(Arrays.toString(arr));
//        Queens(list1,n,0, 0,ans1);
//
//        //System.out.println(Arrays.deepToString(arr1));
//
//
//
//
//    }
//
//
//}
