package Lec_20;

import java.util.LinkedList;

public class Client {
    public static void main(String[] args) {
        Linked_list ll=new Linked_list();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addFirst(60);
//        ll.display();
//        System.out.println(ll.removeFirst());
//        ll.display();
        System.out.println(ll.removeAt(2));
        LinkedList<Integer> ll1=new LinkedList<>();
        
    }
}
