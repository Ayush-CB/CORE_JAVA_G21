package Lec_4;

import java.util.Scanner;

public class Arrays_Basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=5;
        int b=5;
        int arr[]=new int[5];
        System.out.println(arr);
        int brr[]={1,2,3,4,5,6,7};
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
