package Lec_9;

public class Kadanes_algo {
    public static void main(String[] args) {
        int arr[]={3,2,1,-100,4,7,11};
        subarray(arr);
    }
    public static void subarray(int arr[]){
        int csum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            csum=csum+arr[i];
            max=Math.max(max,csum);
            if(csum<0){
                csum=0;
            }
        }
        System.out.println(max);
    }
}
