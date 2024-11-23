package Multithreading.Practice_1;

public class Hi extends Thread{


    public void run(){
        for(int i=0;i<4;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }



}
