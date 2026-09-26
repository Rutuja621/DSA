package org.Queue.com.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
      //  PriorityQueue pr=new PriorityQueue<>();//natural sorting (ascending)
       // PriorityQueue pr=new PriorityQueue<>(Comparator.reverseOrder()); //custom order(user defined) natural or reverse oder
        PriorityQueue pr=new PriorityQueue<>(10,Comparator.reverseOrder());


        pr.add(10);
        pr.add(20);
        pr.add(30);
        pr.add(50);
        pr.add(60);
        pr.add(70);
        pr.add(80);
        pr.add(90);
        pr.add(690);
        pr.add(600);
        pr.add(601);//create new queue if we add element beyond its capacity and copies all elements from old queue
        System.out.println(pr);

       /* while (!pr.isEmpty()){//if queue is not empty then
            System.out.println(pr.poll());//removes element one by one from queue until queue is empty
        }
        System.out.println(pr);*/
    }
}
