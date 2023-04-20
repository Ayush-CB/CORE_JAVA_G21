package Lec_10;

import java.util.Scanner;

public class Check_ith_bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int pos=3;
        System.out.println(check(n,pos));
    }
    public static boolean check(int n,int pos){
        n=n>>(pos-1);
        if((n&1)==1){
            return true;
        }
        else{
            return false;
        }
    }
}
