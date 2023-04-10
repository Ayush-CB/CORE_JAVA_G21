package Lec_2;

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        while(row<=n){
            int str=1;
            while(str<=row){
                System.out.print("* ");
                str++;
            }
            System.out.println();
            row++;
        }
    }
}
