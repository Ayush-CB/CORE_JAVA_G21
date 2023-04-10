package Lec_2;

import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int exception_row=(n/2)+1;
        int cntspace=n-2;
        int leftspace=0;
        int rightspace=0;
        int middlespace=n-2;
        while(row<=n){
            if(row==exception_row){
                int left=0;
                while(left<leftspace){
                    System.out.print("  ");
                    left++;
                }
                System.out.print("* ");
                int right=0;
                while(right<rightspace){
                    System.out.print("  ");
                    right++;
                }
                System.out.println();
            }
            else {
                int left = 0;
                while (left<leftspace){
                    System.out.print("  ");
                    left++;
                }
                System.out.print("* ");
                int middle=0;
                while(middle<middlespace){
                    System.out.print("  ");
                    middle++;
                }
                System.out.print("* ");
                System.out.println();
            }
            if(row<exception_row){
                leftspace++;
                middlespace=middlespace-2;
            }
            else{
                leftspace=leftspace-1;
                middlespace=middlespace+2;
            }
            row++;
        }
    }
}
