package Lec_5;

public class Selection_sort {
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4};
        sort(arr);
    }
    public static void sort(int arr[]){

        for(int i=0;i< arr.length;i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            if(min_idx!=i) {
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
