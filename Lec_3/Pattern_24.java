package Lec_3;
import java.util.*;
public class Pattern_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int cntstar=1;
        int leftspaces=n-1;
        while(row<=n){
            int space=1;
            while(space<=leftspaces){
                System.out.print("  ");
                space++;
            }
            int str=1;
            while(str<=cntstar){
                System.out.print(row+" ");
                str++;
            }
            row++;
            cntstar=cntstar+2;
            leftspaces--;
            System.out.println();
        }
    }
}
