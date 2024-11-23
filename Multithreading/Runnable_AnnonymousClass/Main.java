package Multithreading.Runnable_AnnonymousClass;

public class Main {


    public static void main(String[] args) {

//        Runnable r1 = () ->
//        {
//            for (int i = 0; i < 4; i++) {
//                System.out.println("Hi");
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }  ;
//
//
//
//        Runnable r2 = ()-> {
//
//                for(int j=0;j<4;j++)
//                {
//                    System.out.println("Hello");
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//        };

        //-----------------------------------------------------------------------------


        Thread t1 = new Thread(() ->
        {
            for (int i = 0; i < 4; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } );



        Thread t2 = new Thread(()-> {

            for(int j=0;j<4;j++)
            {
                System.out.println("Hello");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });


        //-----------------------------------------------------------------------------


//        Thread t1 = new Thread(r1);
//
//
//        Thread t2 = new Thread(r2);



        t1.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.start();


    }


}
