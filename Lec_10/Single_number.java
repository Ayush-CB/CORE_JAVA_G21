package Lec_10;

public class Single_number {
    public static void main(String[] args) {
        int arr[]={2,2,3,4,4,5,5};
        single(arr);
    }
    public static void single(int arr[]){
        int ans=0;
        for(int i=0;i< arr.length;i++){
            ans=ans^arr[i];
        }
        System.out.println(ans);
    }
}
