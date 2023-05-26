package Lec_24;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq.size());
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(100);
        pq1.add(200);
        pq1.add(300);
        pq1.add(400);
        System.out.println(pq1.poll());
        System.out.println(pq.isEmpty());
    }
}
