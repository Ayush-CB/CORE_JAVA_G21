package Lec_2;

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int cntstar=n;
        while(row<=n){
            int str=1;
            while(str<=cntstar){
                System.out.print("* ");
                str++;
            }
            cntstar--;
            row++;
            System.out.println();
        }
    }
}
