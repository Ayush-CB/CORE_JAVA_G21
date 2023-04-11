package Lec_3;

import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int cntstar=1;
        int leftspaces=n-1;
        while(row<=(2*n-1)){
            int space=1;
            while(space<=leftspaces){
                System.out.print("  ");
                space++;
            }
            int str=1;
            while(str<=cntstar){
                System.out.print("* ");
                str++;
            }
            if(row<n){
                leftspaces--;
                cntstar++;
            }
            else{
                leftspaces++;
                cntstar--;
            }
            row++;
            System.out.println();
        }
    }
}
