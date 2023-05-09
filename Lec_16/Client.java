package Lec_16;

public class Client {
    public static void main(String[] args) {
//        Child obj=new Child();
//        System.out.println(obj.func());
//        obj.print();
        Calculator obj=new Calculator();
        obj.add(1,32);
//        Basic_calculator.age=9;
        obj.display();
        System.out.println(Basic_calculator.age);

    }
}
