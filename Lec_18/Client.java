package Lec_18;

public class Client {
    public static void main(String[] args) throws Exception {
        Queue q=new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(8);
        System.out.println(q.dequeue());


    }
}
