package Multithreading.ThreadNaming;

public class Naming {

    public static void main(String[] args) {


        Thread t1 = new Thread(
                ()-> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("t1 Thread..");
                    }
                }


        );

        Thread t2 = new Thread(
                ()->{
                    for(int i=0;i<5;i++){
                        System.out.println("t2 Thread..");
                    }

                },"Hello Thread1"


        );

        t1.start();
//        t2.isAlive();
        t2.start();
        System.out.println(t1.getName());

        System.out.println(t2.getName());

    }

}
