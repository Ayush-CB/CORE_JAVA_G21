package Lec_22;

public class Wrapper_class {
    public static void main(String[] args) {
        Integer a=10;
        Double b=2.23;
        int c=3;
        //AUTOBOXING
        Integer d=c;
        //UNBOXING
//       Integer f=new Integer(3);
        int k=a.intValue();
//        System.out.println(k);
        Integer n1=129;
        Integer n2=129;
        System.out.println(n1==n2);

    }
}
