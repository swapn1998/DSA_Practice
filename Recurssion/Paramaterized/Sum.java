package Recurssion.Paramaterized;

public class Sum {

   public static void sum(int i, int add)
   {
       if(i<1)
       {
           System.out.println(add);
           return;
       }

       sum(i-1,add+i);


   }


    public static void main(String[] args) {

       sum(3,0);
    }


}
