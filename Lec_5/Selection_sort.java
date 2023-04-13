package Lec_5;

public class Selection_sort {
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4};
        selection(arr);
    }
    public static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min_idx=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
