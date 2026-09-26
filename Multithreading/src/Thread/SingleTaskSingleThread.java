package Thread;
class Task extends Thread{
    public void run(){
        System.out.println("Task1");
    }
}

public class SingleTaskSingleThread {
    public static void main(String[] args) {
        Task t=new Task();
        t.start();
    }
}
