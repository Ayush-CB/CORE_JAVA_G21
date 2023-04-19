package Lec_9;

public class Circular_subarray {
    public static void main(String[] args) {
        int arr[]={8,-8,9,-9,10,-11,12};
        System.out.println(maximumsum(arr));
    }
    public static int maximumsum(int arr[]){
        int case1=kadane(arr);
        int tsum=0;
        for(int i=0;i< arr.length;i++){
            tsum=tsum+arr[i];
            arr[i]=arr[i]*-1;
        }
        int inverted_sum=kadane(arr);
        int case2=inverted_sum+tsum;
        return Math.max(case1,case2);
    }
    public static int kadane(int arr[]){
        int csum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            csum=csum+arr[i];
            max=Math.max(max,csum);
            if(csum<0){
                csum=0;
            }
        }
        return max;
    }

}
