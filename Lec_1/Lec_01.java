package Lec_1;

import java.util.Scanner;

public class Lec_01 {


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
//        int val=1;
        int _v=2;
//        for(int i=0;i<=9;i++){
//            System.out.println(val);
//            val++;
//            System.out.println(i);
//        }
        int row=1;
        int val=1;
        while(row<=4){
            int i=1;
            while(i<=row){
                System.out.print(val+" ");
                i++;
                val++;
            }
            System.out.println();
            row++;
        }

    }
}
