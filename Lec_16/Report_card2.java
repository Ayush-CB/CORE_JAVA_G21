package Lec_16;

import java.util.Scanner;

public class Report_card2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age= sc.nextInt();
        int sub1=sc.nextInt();
        int sub2= sc.nextInt();
        try{
            if(name.length()==0){
                throw new Exception("Invalid name");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            if(age<0){
                throw new Exception("Invalid age");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            if(sub1<0 || sub2<0){
                throw new Exception("Invalid marks");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
