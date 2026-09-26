package Thread;
 class StaticSynchronization {
//static synchronization
    static int total_seats=20;
    static synchronized void book_seats(int seat){
        if(total_seats>=seat){
            System.out.println("Seats booked: "+seat);
            total_seats=total_seats-seat;
            System.out.println("seats remaining: "+total_seats);
        }else{
            System.out.println("seats cannot be booked ");
            System.out.println("less seats remaining"+total_seats);
        }

    }
}

class MyThread extends Thread{
    BookThreadClass b;
    int seats;
    MyThread(BookThreadClass b,int seats){
        this.b=b;
        this.seats=seats;

    }
    public void run(){
        b.bookSeat(seats);
    }

}

public class MovieBookAppp{
    public static void main(String[] args) {
        BookThreadClass b1 =new BookThreadClass();

        MyThread m=new MyThread(b1,4);
        m.setName("Rutuja");
        m.start();

        BookThreadClass b2 =new BookThreadClass();

        MyThread m1=new MyThread(b2,4);
        m1.setName("Misal");
        m1.start();
    }
}
