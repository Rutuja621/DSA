package Thread;

class TotalEarnings extends Thread{
    int total=0;
    public void run(){
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + 100;
            }
            this.notify();
        }
    }
}

public class InterThreadCommunication {

    public static void main(String[] args) throws InterruptedException {
        TotalEarnings tt=new TotalEarnings();
        tt.start();

        //System.out.println("Total Earnings: "+tt.total+"rs");
        //problem : here this will give output as 0 because here main thread will complete its task and directly prints above line it not go into for loop
        //to solve this problem


        synchronized (tt){
            tt.wait();
            System.out.println("Total Earnings: "+tt.total+"rs");
        }

    }
}
