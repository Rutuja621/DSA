package Thread;

 class BookThreadClass {
    int total_seats=6;
//Example of synchronized method
   // synchronized void bookSeat(int seats){
void bookSeat(int seats){
    System.out.println("Thread: "+Thread.currentThread().getName());
    System.out.println("Thread: "+Thread.currentThread().getName());

    System.out.println("Thread: "+Thread.currentThread().getName());

    //synchronized block
    synchronized (this) {
        if (total_seats >= seats) {
            System.out.println("Seats are booked: " + seats);
            total_seats = total_seats - seats;
            System.out.println("seat left: " + total_seats);
        } else {
            System.out.println("seats cannot be booked");
            System.out.println("total seats remaining: " + total_seats);

        }
    }

    System.out.println("Thread: "+Thread.currentThread().getName());

    System.out.println("Thread: "+Thread.currentThread().getName());

    System.out.println("Thread: "+Thread.currentThread().getName());

    }
}

public class MovieBook extends Thread{
    static BookThreadClass b ;
    int seat;
    public void run(){
        b.bookSeat(seat);
    }

    public static void main(String[] args) {
        b=new BookThreadClass();

        MovieBook mba=new MovieBook();
        mba.seat=3;
        mba.start();

        MovieBook mba1=new MovieBook();
        mba1.seat=3;
        mba1.start();

    }


}
