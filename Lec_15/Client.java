package Lec_15;

public class Client {
    public static void main(String[] args) throws Exception {
        Person obj=new Person("A",18);
//        Person obj1=new Person();
        obj.setName("B");
        obj.setAge1(-20);
//        int arr[]=new int[4];
//        System.out.println(arr[4]);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
