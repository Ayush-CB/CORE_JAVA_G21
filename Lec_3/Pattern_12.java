package Lec_3;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int leftspaces=n-1;
        int cntstar=1;
        while(row<=n){
            int space=1;
            while(space<=leftspaces){
                System.out.print("  ");
                space++;
            }
            int str=1;
            while(str<=cntstar){
                if(str%2!=0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("! ");

                }
                str++;
            }
            row++;
            cntstar=cntstar+2;
            leftspaces--;
            System.out.println();
        }
    }
}
