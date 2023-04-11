package Lec_3;

import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int cntstar=n;
        int leftspaces=0;
        while(row<=(2*n-1)){
            int space=0;
            while(space<leftspaces){
                System.out.print("  ");
                space++;
            }
            int str=1;
            while(str<=cntstar){
                System.out.print("* ");
                str++;
            }
            if(row<n){
                leftspaces=leftspaces+2;
                cntstar--;
            }
            else{
                leftspaces=leftspaces-2;
                cntstar++;
            }
            row++;
            System.out.println();
        }
    }
}
