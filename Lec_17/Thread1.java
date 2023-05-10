package Lec_17;

public class Thread1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("Inside thread1"+Thread.currentThread());
        }
    }
}
