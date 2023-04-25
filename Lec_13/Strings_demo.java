package Lec_13;

import java.util.Scanner;

public class Strings_demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        char c=sc.next().charAt(0);
//        System.out.println((int)c);
        String demo="JAVA";
        String demo1="JA"+"VA";
        String demo2=new String("JAVA");
//        String in=sc.nextLine();
//        System.out.println(demo==demo1);
//        System.out.println(demo==demo2);
        //LENGTH OF STRING
        System.out.println(demo.length());
        //INDEING
        System.out.println(demo.charAt(1));
        //SUBSTRING
        System.out.println(demo.substring(0,3));
        String demo3=demo.substring(0,3);
        System.out.println(demo==demo3);
        //CHARACTER INDEX
        System.out.println(demo.indexOf('A'));
        System.out.println(demo.lastIndexOf('A'));
        //String Words Comparison
        String s1="HELLO";
        String s2="HELLO1";
        System.out.println(s1.equals(s2));
    }
}
