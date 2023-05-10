package Lec_17;

public class Thread2 extends  Thread{
    public Thread2(String message){
        super(message);
    }
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Thread2 is running inside"+Thread.currentThread());
        }
    }

}
