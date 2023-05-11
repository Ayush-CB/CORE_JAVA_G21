package Lec_18;

public class Queue {
    int arr[];
    int start;
    int size;
    public Queue(){
        arr=new int[5];
        start=0;
        size=0;
    }
    public void enqueue(int val) throws Exception {
//        if(isFull()){
//            throw new Exception("Queue is full");
//        }
        int index=(start+size)% arr.length;
        arr[index]=val;
        size++;
    }
    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int data=arr[start];
        start=(start+1)%arr.length;
        size--;
        return data;
    }
    public int peek(){
        return arr[start];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size== arr.length;
    }
}
