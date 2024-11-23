package Multithreading.Practice_1;

public class Demo {


    public static void main(String[] args) {

        Hi h1= new Hi();
         h1.start();

        Hello h2= new Hello();
        h2.start();

    }

}
