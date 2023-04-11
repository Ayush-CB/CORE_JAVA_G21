package Lec_3;

import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int leftstr=1;
        int rightstr=1;
        int middlespaces=2*n-3;
        while(row<n){
            int left=1;
            while(left<=leftstr){
                System.out.print("* ");
                left++;
            }
            int spaces=1;
            while(spaces<=middlespaces){
                System.out.print("  ");
                spaces++;
            }
            int right=1;
            while(right<=rightstr){
                System.out.print("* ");
                right++;
            }
            leftstr++;
            rightstr++;
            row++;
            middlespaces=middlespaces-2;
            System.out.println();
        }
        int i=1;
        while(i<=(2*n-1)){
            System.out.print("* ");
            i++;
        }
        System.out.println();
    }
}
