package Lec_2;

import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int cntspace=n-1;
        int cntstar=1;
        while(row<=n){
            int space=1;
            while(space<=cntspace){
                System.out.print("  ");
                space++;
            }
            int star=1;
            while(star<=row){
                System.out.print("* ");
                star++;
            }
            cntspace--;
            row++;
            System.out.println();
        }
    }
}
