package Lec_8;

public class Maximum_subarray_sum {
    public static void main(String[] args) {
        int arr[]={3,1,2,-100,7,11};
        int arr1[]={-1,-2,-3,-4,-5};
        subarray(arr);
    }
    public static void subarray(int arr[]){
        int csum=0;
        int max=Integer.MIN_VALUE;
        int mininfinity=Integer.MIN_VALUE;
        int maxinfinity=Integer.MAX_VALUE;
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
