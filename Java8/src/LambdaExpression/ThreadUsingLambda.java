package LambdaExpression;

public class ThreadUsingLambda {
    public static void main(String[] args) {
        //Runnale :- functional interface with lambda expression

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
       //call run to execute thread
        Thread thread=new Thread(rn,"MyThread");
        thread.start();
    }

}
