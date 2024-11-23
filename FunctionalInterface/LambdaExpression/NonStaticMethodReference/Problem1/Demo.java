package FunctionalInterface.LambdaExpression.NonStaticMethodReference.Problem1;

public class Demo {


    public void printNumber(int num){

        System.out.println("Using non-static Method reference Welcome "+num);

    }

    public static void main(String[] args) {

        Intr intr = new Demo() :: printNumber;

        intr.printNumber(69);


        Intr intr2 = System.out::println;
        intr2.printNumber(100);
    }


}
