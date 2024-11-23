package Multithreading.Runnable_Interface;
// In this example 2 different threads are working on two different objects simulatneously.
//  thread name by default will be given by JVM
//Thread priority also bydefault will be given by JVM -> Valid range will be 1 to 10.


public class RunThread implements Runnable{

    @Override
    public void run() {

         for(int i=0;i<5;i++)
         {
             System.out.println(Thread.currentThread().getName()+": "+i);
         }


    }

    public static void main(String[] args) {

        RunThread run = new RunThread();

        Thread one = new Thread(run);

        Thread two = new Thread(run);

        one.setName("Raj");
        two.setName("Simran");

        one.start();
        two.start();





    }
}
