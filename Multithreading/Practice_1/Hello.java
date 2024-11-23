package Multithreading.Practice_1;

public class Hello extends Thread{

    public void run(){
        for(int i=0;i<4;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
