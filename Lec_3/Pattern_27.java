package Lec_3;
import java.util.*;
public class Pattern_27 {
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
            int pos=1;
            while(str<=cntstar){
                System.out.print(pos+" ");
                if(str<(cntstar/2+1))
                    pos++;
                else
                    pos--;
                str++;

            }
            cntstar=cntstar+2;
            leftspaces--;
            row++;
            System.out.println();
        }
    }
}
