package Multithreading.Runnable_Interface;

public class Demo1 {


    public static void main(String[] args) {

        A a1 = new A ();
        Thread t1 = new Thread(a1);
        t1.start();

    }


}
