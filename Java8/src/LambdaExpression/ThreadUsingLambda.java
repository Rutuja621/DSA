package LambdaExpression;

public class ThreadUsingLambda {
    public static void main(String[] args) {
        //Runnale :- functional interface with lambda expression
   //no need to add or extend another class
        Runnable rn=() ->{
            //this is thread body

            for (int i = 1; i < 10; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }

        };

        Thread thread=new Thread(rn,"MyThread");
        thread.start();
    }

}
