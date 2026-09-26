package Thread;
class Child extends Thread{
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println("Thread Running"+Thread.currentThread().getName());
        }
    }
}
public class Join_Method extends Thread{


    public static void main(String[] args) throws InterruptedException {



        Child jn=new Child();
        jn.setName("Child Tread");
        jn.start();

        jn.join();//executed by main thread (written in method) so main method waits



        for(int i=0;i<=5;i++){
            System.out.println("Running: "+currentThread().getName());

        }



    }
}
