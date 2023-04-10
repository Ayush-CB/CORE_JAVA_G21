package Lec_2;

import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int cntstar=n;
        int spaces=0;
        while(row<=n){
            int i=0;
            while(i<spaces){
                System.out.print("  ");
                i++;
            }
            int star=1;
            while(star<=cntstar){
                System.out.print("* ");
                star++;
            }
            row++;
            cntstar--;
            spaces=spaces+2;
            System.out.println();
        }
    }
}
