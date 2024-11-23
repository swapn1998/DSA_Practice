package Recurssion.RatinMaze;

import java.util.ArrayList;

public class ratMaze {


    public static void Maze(int[][]arr,boolean[][]bool,int i,int j,int n,String list, ArrayList<String>ans)
    {

        if(i==n-1 && j==n-1)
        {

            ans.add(list);

            return;

        }

        if(i+1<n && arr[i+1][j]==1 && bool[i+1][j]==false)
        {
            bool[i][j]=true;
            Maze(arr,bool,i+1,j,n,list+"D",ans);
            bool[i][j]=false;


        }

        if(j-1>=0 && arr[i][j-1] == 1 && bool[i][j-1] == false)
        {
            bool[i][j]=true;
            Maze(arr,bool,i,j-1,n,list+"L",ans);
            bool[i][j]=false;

        }

        if(j+1<n && arr[i][j+1] == 1 && bool[i][j+1] == false)
        {
            bool[i][j]=true;
            Maze(arr,bool,i,j+1,n,list+"R",ans);
            bool[i][j]=false;

        }


        if(i-1>=0 && arr[i-1][j] == 1 && bool[i-1][j] == false)
        {
            bool[i][j]=true;
            Maze(arr,bool,i-1,j,n,list+"U",ans);
            bool[i][j]=false;

        }

    }



    public static void main(String[] args) {

        int n=4;
        int[][]m={{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};
        boolean[][] bool1 = new boolean[n][n];

        String str="";

        ArrayList<String>ans1 = new ArrayList<>();

        if(m[0][0]==0)
        {
            ans1.add("-1");
            System.out.println(ans1);
        }

        Maze(m,bool1,0,0,n,str,ans1);

        System.out.println(ans1);





    }


}
