package Lec_7;

public class Linear_search {
    public static void main(String[] args) {
        int arr[]={3,1,2,9,6,5};
        int target=5;
        search(arr,target);
    }
    public static void search(int arr[],int target){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
