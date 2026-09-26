package Thread;
class TaskMM extends Thread{
    public void run(){
        System.out.println("Task1");
    }
}

class TaskMM1 extends Thread{
    public void run(){
        System.out.println("Task1");
    }
}

class TaskMM2 extends Thread{
    public void run(){
        System.out.println("Task1");
    }
}

public class MultipleTaskMultipleThread {
    public static void main(String[] args) {
      TaskMM t1=new TaskMM();
      TaskMM1 t2=new TaskMM1();
      TaskMM2 t3=new TaskMM2();

      t1.start();
      t2.start();
      t3.start();
    }
}
