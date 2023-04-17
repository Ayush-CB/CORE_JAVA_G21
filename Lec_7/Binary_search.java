package Lec_7;

public class Binary_search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int target=6;
        binary(arr,target);
    }
    public static void binary(int arr[],int target){
        int n= arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(arr[middle]==target){
                System.out.println(middle);
                return;
            }
            else if(arr[middle]<target){
                start=middle+1;
            }
            else{
                end=middle-1;
            }
        }
        System.out.println(-1);
    }
}
