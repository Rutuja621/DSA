package Thread;
//not possible single thread can perform single task
class TaskS extends Thread{
    public void task1(){
        System.out.println("task 1");
    }

    public void task2(){
        System.out.println("task 2");
    }
}

public class MultipleTaskSingleThread {
    public static void main(String[] args) {
        TaskS t=new TaskS();
        t.task1();
        t.task2();

    }
}
