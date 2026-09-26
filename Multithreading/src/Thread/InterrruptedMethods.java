package Thread;

public class InterrruptedMethods extends Thread{
    public void run(){
        System.out.println(Thread.interrupted());//true-->false
      //  System.out.println(Thread.currentThread().isInterrupted());//true --> true
        try {
            for (int i=0;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println(Thread.interrupted());//checks the interrupted status(not ) returns false
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
         InterrruptedMethods ms=new InterrruptedMethods();
         ms.start();
         ms.interrupt();//when sleep or wait is called it directly goes int catch block
        //System.out.println(ms.isInterrupted());
    }
}
