package FunctionalInterface.LambdaExpression.Calculator;

public class Main {

    public static void main(String[] args) {

    Calculate c1 = (a,b)->{

        System.out.println("Addition: "+ (a+b));
        System.out.println("Substraction: "+ (a-b));
        System.out.println("Multiplication: "+ (a*b));
        System.out.println("Division: "+ (a/b));


    };

    c1.operations(10,2);


    }


}
