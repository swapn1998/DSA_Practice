package Recurssion.Functional;

public class Sum1 {

    public static int add1(int n)
    {

        if(n==0)
        {
            return 0;
        }

        return n + add1(n-1);

    }


    public static void main(String[] args) {

        System.out.println(add1(3));

    }


}
