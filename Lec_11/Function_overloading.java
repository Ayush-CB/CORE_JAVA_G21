package Lec_11;

public class Function_overloading {
    public static void main(String[] args) {
//        System.out.println(add(1,2));
        System.out.println(add(1.0,2.0));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static float add(double a,double b){
        return (float) (a+b);
    }
}
