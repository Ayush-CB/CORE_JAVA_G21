package Lec_10;

import java.util.Scanner;

public class Set_ith_bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=2;
        System.out.println(setbit(n,pos));
    }
    public static int setbit(int n,int pos){
        int mask=1<<(pos-1);
        return n|mask;
    }
}
