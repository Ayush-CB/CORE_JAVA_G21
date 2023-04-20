package Lec_10;

public class Search_in_2D {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        print(arr,19);
        print2(arr,11);
    }
    public static void print(int arr[][],int target){
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(arr[row][col]==target){
                    System.out.println(row+"   "+col);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
    public static void print2(int arr[][],int target){
        int startrow=0;
        int startcol=arr[0].length-1;
        while(startcol>=0 && startrow< arr.length){
            if(arr[startrow][startcol]==target){
                System.out.println(startrow+"  "+startcol);
                return;
            }
            else if(arr[startrow][startcol]<target){
                startrow++;
            }
            else{
                startcol--;
            }
        }
        System.out.println(-1);
    }
}
