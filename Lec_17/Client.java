package Lec_17;

public class Client {
    public static void main(String[] args) {
        System.out.println("Main is running");
        Thread obj=new Thread2("Thread1");
        obj.start();

        Thread obj1=new Thread(new Thread1());
        obj1.start();
        obj1.setPriority(2);
        System.out.println("Main is ending");
        System.out.println(obj.isAlive());
    }
}
