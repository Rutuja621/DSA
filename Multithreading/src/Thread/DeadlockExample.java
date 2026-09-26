package Thread;

class A {

    // synchronized methods create object-level locks.
// Main Thread gets A's lock and goes to sleep.
// Thread-1 gets B's lock and goes to sleep.
// sleep() does NOT release the lock.
// After waking, Main Thread tries to call B's synchronized last(),
// but B's lock is held by Thread-1.
// Thread-1 tries to call A's synchronized last(),
// but A's lock is held by Main Thread.
// Both wait for each other -> DEADLOCK.
synchronized void d1(B b) {

        System.out.println("Thread 1 starts execution of A");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        System.out.println("Thread 1 trying to call B's last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside A last()");
    }
}


class B {

    synchronized void d2(A a) {

        System.out.println("Thread 2 starts execution of B");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        System.out.println("Thread 2 trying to call A's last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("Inside B last()");
    }
}


public class DeadlockExample extends Thread {

    A a = new A();
    B b = new B();

    public void m1() {

        this.start();

        a.d1(b); //called by main
    }

    public void run() {

        b.d2(a);//called by child
    }

    public static void main(String[] args) {

        DeadlockExample obj = new DeadlockExample();//child

        obj.m1();
    }
}