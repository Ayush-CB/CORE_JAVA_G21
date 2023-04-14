package Lec_5;

public class Product_of_array_except_self {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        product1(arr);
    }
    public static void product(int arr[]){
        for(int i=0;i<arr.length;i++){
            int prod=1;
            for(int j=0;j<arr.length;j++){
                if(j!=i){
                    prod=prod*arr[j];
                }
            }
            System.out.print(prod+" ");
        }
    }
    public static void product1(int arr[]){
        int leftarray[]=new int[arr.length];
        int rightarray[]=new int[arr.length];
        leftarray[0]=arr[0];
        rightarray[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            leftarray[i]=leftarray[i-1]*arr[i];
        }
        for(int i=arr.length-2;i>=0;i--){
            rightarray[i]=rightarray[i+1]*arr[i];
        }
        System.out.print(rightarray[1]+" ");
        for(int i=1;i<arr.length-1;i++){
            int ans=leftarray[i-1]*rightarray[i+1];
            System.out.print(ans+" ");
        }
        System.out.print(leftarray[arr.length-2]+" ");
    }
}
