package Recurssion;

public class Main2 {

    static String  name = "Raj";
    static int count = 0;

    public static void print(int i,int n){

        if(i>n)
        {

            return;

        }

        System.out.println("Raj");

        print(i+1,n);


    }
    public static void main(String[] args) {


        Main2.print(1,3);
    }


}
