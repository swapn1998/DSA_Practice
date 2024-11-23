package FunctionalInterface.LambdaExpression.StaticMethodReference.Problem1;

public class Main {

    public static void sayHello(String s){

        System.out.println("Using static Method reference Welcome "+s);
    }

    public static void main(String[] args) {

        Intr intr= Main::sayHello;

        intr.sayHello("swapnil");

    }


}
