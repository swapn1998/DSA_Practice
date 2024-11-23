package Multithreading.Runnable_Interface;

public class A implements Runnable{


    public void run(){

        for(int i=0;i<5;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {


            }
        }

    }



}
