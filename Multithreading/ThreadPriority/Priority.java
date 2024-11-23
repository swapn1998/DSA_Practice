package Multithreading.ThreadPriority;

public class Priority {


    public static void main(String[] args) {


        Thread t1 = new Thread(
                ()-> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("t1 Thread..");

                        System.out.println(Thread.currentThread().getPriority());
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


//        System.out.println(t1.getPriority());
   //     System.out.println(t2.getPriority());

     t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

    }
}
