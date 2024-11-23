package Multithreading.Synchronized;

public class Synchonize {

    public static void main(String[] args) throws Exception{

        Counter counter = new Counter();

        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<1000;i++) {

                            counter.count1();


                        }
                    }
                }
        );


        Thread t2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<1000;i++) {

                            counter.count1();


                        }
                    }
                }
        );

        t1.start();
        t1.join();

        t2.start();
         t2.join();

        System.out.println( "Count: " + counter.count);

        //System.out.println( "Count: " + counter.count);




    }


}
