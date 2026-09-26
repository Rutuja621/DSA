package Thread;

public class ThreadMethods extends Thread {
    public void run(){
        System.out.println("task1 is executed by "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("hello is executed by "+Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("rutuja");
//        System.out.println(Thread.currentThread().getName());

        ThreadMethods th=new ThreadMethods();
        th.start();
        System.out.println(th.getName());//jvm automatically provides the thread name Thread 0 this is printed first

        System.out.println(Thread.currentThread().isAlive());

    }
}
