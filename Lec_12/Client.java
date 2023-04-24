package Lec_12;

public class Client {
    public static void main(String[] args) {
        Child c=new Child();
//        System.out.println(c.marks);
//        System.out.println(c.rollno);
//        System.out.println(c.houseno);
//        System.out.println(c.pincode);
//        System.out.println(c.data);
//        System.out.println(((Parent)c).data);
        //CASE--2
        Parent p=new Child();
//        System.out.println(p.data);
        int a=30;
        long b=a;
        //CASE--3
//        Child ch= new Parent();
//        int co=(int)b;
        //CASE--4
        Parent pr=new Parent();
//        System.out.println(p.data);
        Child_1 obj=new Child_1();
        obj.print();
    }

}
