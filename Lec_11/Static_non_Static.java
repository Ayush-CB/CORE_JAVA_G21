package Lec_11;

public class Static_non_Static {
    static int age=5;
    public static void main(String[] args) {
        Static_non_Static s=new Static_non_Static();
        s.print();
        System.out.println(age);
    }
    public void print(){
        System.out.println("Hello world");
    }
}
