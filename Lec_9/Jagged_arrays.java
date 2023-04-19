package Lec_9;

import java.util.Scanner;

public class Jagged_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][];
        for(int row=0;row< arr.length;row++){
            int size=sc.nextInt();
            arr[row]=new int[size];
        }
        for(int row=0;row< arr.length;row++){
            System.out.println(arr[row].length);
        }
    }
}
