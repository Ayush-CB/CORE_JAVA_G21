package Lec_2;

import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int leftspaces=n-1;
        int cntstar=1;
        while(row<=n){
            int space=1;
            while(space<=leftspaces){
                System.out.print("  ");
                space++;
            }
            int star=1;
            while(star<=cntstar){
                if(star%2==0){
                    System.out.print("  ");

                }
                else{
                    System.out.print("* ");
                }
                star++;
            }
            leftspaces--;
            cntstar=cntstar+2;
            row++;
            System.out.println();
        }
    }
}
