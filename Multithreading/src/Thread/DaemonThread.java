package Thread;
class Prorities extends Thread{
    @Override
    public void run() {
        System.out.println("Task2");
    }
}
public class DaemonThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()) {
            System.out.println("Deamon Thread Executing");
        }else{
            System.out.println("Child Thread");
        }
    }


    public static void main(String[] args) {


        DaemonThread dd=new DaemonThread();
        dd.setDaemon(true);
        dd.start();//this will print nothing when main thread doesnt excuting any task
        //daemon thread excutes till excution of main thread

        Prorities dd1=new Prorities();
        dd1.start();
        dd1.setPriority(10);
        System.out.println("Priorities: "+dd1.getPriority());
        System.out.println("Daemon Thread: "+dd.getPriority());
        System.out.println("Main Thread");
    }
}
