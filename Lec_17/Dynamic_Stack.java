package Lec_17;

public class Dynamic_Stack extends Stack{

    public void push(int val) throws Exception {
        if(super.isFull()){
            int data[]=new int[2*super.arr.length];
            for(int i=0;i<super.arr.length;i++){
                data[i]=super.arr[i];
            }
            super.arr=data;
        }
        super.push(val);
    }
}
