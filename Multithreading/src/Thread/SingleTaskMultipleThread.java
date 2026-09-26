package Thread;
class Taskk extends Thread{
    public void run(){
        System.out.println("Task1");
    }
}
public class SingleTaskMultipleThread {
    public static void main(String[] args) {
        Taskk task=new Taskk();
        Thread t1=new Thread(task);
        t1.start();

        Thread t2=new Thread(task);
        t2.start();


    }
}
