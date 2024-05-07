package Recurssion;

public class Main3 {

    static int sum=0;
    public static void print(int n){

        if(sum>n)
        {
            return;
        }

        System.out.println(sum);
        sum = sum +1;
        print(n);
    }


    public static void main(String[] args) {

        Main3.print(3);
    }
}
