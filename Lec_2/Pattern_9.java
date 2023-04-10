package Lec_2;

import java.util.Scanner;

public class Pattern_9 {
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
                System.out.print("* ");
                star++;
            }
            cntstar=cntstar+2;
            leftspaces--;
            System.out.println();
            row++;
        }
    }
}
