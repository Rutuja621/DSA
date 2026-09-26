package Runnable;

public class ThreadCreationRunnable implements Runnable{

    public void run(){
        System.out.println("Thread using Runnable");
    }


    public void run(int i){
        System.out.println("Thread using Runnable11");
    }
    public static void main(String[] args) {
        ThreadCreationRunnable tt=new ThreadCreationRunnable();

        Thread thread=new Thread(tt);
        thread.start();//it will not call parameterized run method

        tt.run(10);//to call parameterized run
        tt.run();
    }
}
