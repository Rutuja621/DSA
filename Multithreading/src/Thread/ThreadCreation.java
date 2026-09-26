package Thread;

class Count{
    int count=0;
    public void increment(){

        count++;
    }
}

public class ThreadCreation extends Thread{

    public void run(){

        System.out.println("Thread Started");
    }


    public static void main(String[] args) {
        Count cnt=new Count();
        ThreadCreation t1=new ThreadCreation();// class object
        ThreadCreation t2= new ThreadCreation();
        t1.start();//this internally calls run()
        t2.start();
    }
}
