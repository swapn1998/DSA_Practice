package FunctionalInterface.LambdaExpression.StaticMethodReference.Problem2;



public class Demo {

    public static int fun1(String s1){

        System.out.println("Using static Method reference Welcome "+s1);

        return Integer.parseInt(s1);

    }

    public static void main(String[] args) {

        Intr intr = Demo::fun1;

        int ans = intr.convertToInteger("100");

        System.out.println(ans);


    }

}
