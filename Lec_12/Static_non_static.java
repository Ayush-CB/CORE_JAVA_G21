package Lec_12;



public class Static_non_static {
     static int data=34;
    public static void main(String[] args) {
       Static_non_static obj=new Static_non_static();
        obj.print2();
        System.out.println(data);
    }
    public static void print(){
        System.out.println("Hello world");
    }
    public void print2(){
        System.out.println("Hello");
        print();
        System.out.println(data);
    }
}
