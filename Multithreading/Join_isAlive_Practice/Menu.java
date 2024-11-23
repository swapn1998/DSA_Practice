package Multithreading.Join_isAlive_Practice;

public class Menu {


    public static void main(String[] args) throws Exception{


        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<4;i++)
                {
                    System.out.println("Thread1");
                }
            }
        };



        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for(int j=0;j<4;j++)
                {
                    System.out.println("Thread2");
                }
            }
        };


        Thread t1 = new Thread(r1);

        Thread t2 = new Thread(r2);

         t1.start();
         t1.isAlive();
         t2.start();

         t2.isAlive();

         t1.join();

         t2.join();

         t1.isAlive();
         t2.isAlive();
        System.out.println("Bye Bye...");





    }



}
