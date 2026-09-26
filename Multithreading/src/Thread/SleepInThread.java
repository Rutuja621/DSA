package Thread;

public class SleepInThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            Thread.yield();
         /*   try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            System.out.println(i);
*/

                System.out.println(Thread.currentThread().getName()+"");

        }
    }

    public static void main(String[] args) {
        SleepInThread ss=new SleepInThread();
        ss.start();/*
         when we use run() instead of start and called two times then this will treat it as a method
         first will complete its execution and then another will execute
         in case of start() it treat as thread and two threads are execute simultaneously(multithreading)

         */
     //   Thread.yield();
        for (int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" ");
        }

     //   SleepInThread ss1=new SleepInThread();
        //ss1.start();

       // for(int i=0;i<=5;i++){
            //Thread.sleep(1000);
          //  System.out.println(i);

        //}


    }
}
