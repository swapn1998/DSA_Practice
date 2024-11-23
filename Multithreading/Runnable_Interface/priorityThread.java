package Multithreading.Runnable_Interface;

public class priorityThread extends Thread{

    @Override
    public void run() {


    }

    public static void main(String[] args) {


        priorityThread p1= new priorityThread();

        priorityThread p2= new priorityThread();

        priorityThread p3= new priorityThread();

        System.out.println("Priority Of p1 Thread: "+ p1.getPriority());

        System.out.println("Priority Of p1 Thread: "+ p2.getPriority());

        System.out.println("Priority Of p3 Thread: "+ p3.getPriority());

        p1.setPriority(1);

        p2.setPriority(2);

        p3.setPriority(3);

        System.out.println("Priority Of p1 Thread: "+ p1.getPriority());

        System.out.println("Priority Of p1 Thread: "+ p2.getPriority());

        System.out.println("Priority Of p3 Thread: "+ p3.getPriority());

        System.out.println("--------------------------------------------------");

        System.out.println("Current Exceuted thread: "+ Thread.currentThread().getName());

        System.out.println("Current thread priority: "+ Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);

        System.out.println("Current thread priority: "+ Thread.currentThread().getPriority());
        

    }
}
