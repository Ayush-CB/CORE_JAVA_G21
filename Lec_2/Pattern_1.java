package Lec_2;

import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        while(row<=n){
            //number of stars=n
            int str=1;
            while(str<=n){
                System.out.print("* ");
                str++;
            }
            //Prepare for second row
            System.out.println();
            row++;
        }
    }
}
