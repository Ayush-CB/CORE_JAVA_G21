package Lec_15;

public class String_buffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println(sb);
        sb.setCharAt(1,'s');
        System.out.println(sb);
        sb.append(" JAVA");
        System.out.println(sb);
        sb.insert(1,"Hey");
        System.out.println(sb);
        StringBuffer sb1=new StringBuffer("Hello");
//        sb1.replace(1,3,"Java");
//        System.out.println(sb1);
        sb1.delete(1,3);
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
        StringBuffer sb2=new StringBuffer();
        System.out.println(sb2.capacity());
        sb2.append("Hello");
        System.out.println(sb2.capacity());
        sb2.append("Hello Hello  ");
        System.out.println(sb2.capacity());
        String h=sb.toString();
        System.out.println(h);
        StringBuilder sb4=new StringBuilder("Hello");


    }
}
