package Lec_18;

public class Dynamic_Queue extends Queue{
    public void enqueue(int val) throws Exception {
        if(super.isFull()){
            int data[]=new int[2*super.arr.length];
            for(int i=0;i<super.arr.length;i++){
                data[i]=super.arr[(i+super.start)%super.arr.length];
            }
            this.arr=data;
            this.start=0;
        }
        super.enqueue(val);
    }

}
