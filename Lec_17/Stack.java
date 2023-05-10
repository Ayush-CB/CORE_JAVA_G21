package Lec_17;

public class Stack {
    int arr[];
    int top;
    public Stack(){
        arr=new int[5];
        top=0;
    }
    public Stack(int size){
        arr=new int[size];
        top=0;
    }
    public void push(int val) throws Exception {

//        if(isFull()){
//            throw new Exception("Stack is full");
//        }
        this.arr[top]=val;
        top++;
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int remove=arr[top];
        top--;
        return remove;
    }
    public int peek(){
        return arr[top];
    }
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }

    }
    public boolean isEmpty(){
        return top<0;
    }
    public boolean isFull(){
        return top== this.arr.length;
    }

}
