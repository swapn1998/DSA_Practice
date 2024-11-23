package FunctionalInterface.normalInterface;

public class LambdaClass {


    public static void main(String[] args) {

        Bird bird = (String val) -> {

            System.out.println(val + "can fly on lambda expression.......");
        };

        bird.canFly("Eagle ");

    }


}
