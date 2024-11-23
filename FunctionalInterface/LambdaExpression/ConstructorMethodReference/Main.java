package FunctionalInterface.LambdaExpression.ConstructorMethodReference;

public class Main {

    Main(){
        System.out.println("Method reference using Constructor");
    }

    public static void main(String[] args) {

        Intr intr = Main::new;
        intr.sayHello();
    }


}
