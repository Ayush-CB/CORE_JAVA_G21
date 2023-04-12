package Lec_4;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count_digit=count(n);
        int res=armstrong(n,count_digit);
        System.out.println(res);
        if(n==res){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not a Armstrong");
        }
    }
    public static int count(int n){
        int c=0;
        while(n>0){
            c++;
            n=n/10;
        }
        return c;
    }
    public static int armstrong(int n,int num){
        int result=0;
        while(n>0){
            int dig=n%10;
            result=((int)Math.pow(dig,num))+result;
            n=n/10;
        }
        return result;
    }
}
